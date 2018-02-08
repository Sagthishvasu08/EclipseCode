package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver = null ;
	WebElement ele = null;
	int i=1;  //*This variable is to store the screen file with unique name*

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser "+browser+" Launched successfully");
		} catch (WebDriverException e) {

			System.out.println("WebDriver is not found");
		}
		catch (NullPointerException e) {

			System.out.println("URL not available");
		}
		finally {
			takeSnap();
		}
	}

	public void startApp(String browser) {


	}

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": 
				ele = driver.findElementById(locValue);
				break;
			case "xpath": 
				ele = driver.findElementByXPath(locValue);
				break;	
			case "class": 
				ele = driver.findElementByClassName(locValue);
				break;
			case "LinkText":
				ele=driver.findElementByLinkText(locValue);
				break;
			}		
			
		} catch (NoSuchElementException e) {
			System.out.println("No Such Element Found");

		}catch (NullPointerException e) {
			System.out.println("No locator value available");
		}
		finally {
			takeSnap();
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("Given Value :"+data+" Is Entered Successfully");
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("Element is Clicked Successfully");


	}

	public String getText(WebElement ele) {
		String eleText=ele.getText();
		System.out.println("The text captured from the WebElement is:"+eleText);
		return eleText;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(value);
		System.out.println("Dropdown text"+value+"selected successfully");
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);
		System.out.println("Dropdown index"+index+"selected successfully");
	}

	public boolean verifyTitle(String expectedTitle) {
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)){
			System.out.println("Expected and Actual Title is matching!");
			return true;
		}
		else if(expectedTitle.equalsIgnoreCase(actualTitle)){
			System.out.println("Expected and Actual Title is matching!");
			return true;
		}

		else{
			System.out.println("Expected and Actual Title is NOT matching!");
			return false;
		}
	}
	public void verifyExactText(WebElement ele, String expectedText) {
		String actualText=ele.getText();
		if(actualText.contains(expectedText))
		{
			System.out.println("Expected text displayed");
		}
		else
		{
			System.out.println("Expected text is not displayed");
		}
	}


	public void verifyPartialText(WebElement ele, String expectedText) {
		String partialText=ele.getText();
		if(partialText.startsWith(expectedText))
		{
			System.out.println("Expected text displayed");
		}
		else
		{
			System.out.println("Expected text is not displayed");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		ele.isSelected();
	}

	public void verifyDisplayed(WebElement ele) {
		ele.isDisplayed();
	}

	public void switchToWindow(int index) {
		Set<String> allWindowHandles=driver.getWindowHandles();
		List<String> allWindow=new ArrayList<String>();
		allWindow.addAll(allWindowHandles);
		String secondWindow=allWindow.get(index);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		System.out.println("Accepted the Alert Successfully");
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		System.out.println("Accepted the dismissed Successfully");

	}

	public String getAlertText() {
		Alert alert=driver.switchTo().alert();
		String AT=alert.getText();
		System.out.println("The Alert Text is:"+AT);
		return AT; //check this is required

	}

	public void takeSnap() {
		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./Snaps/Snap"+(i)+".jpeg");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}catch (WebDriverException e){
			System.err.println("Driver is not exist");
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Current Browser is closed successfully");

	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("All open browsers are closed successfully");
	}

}
