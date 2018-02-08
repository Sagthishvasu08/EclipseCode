package week1.day7;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner year=new Scanner(System.in);
		System.out.println("Enter the year to check it is leap year or not");
		int yy=year.nextInt();
		year.close();
		boolean isLeapYear;
		if (yy%4==0){
			isLeapYear=true;
		}
		else if (yy%100==0){
			isLeapYear=true;
		} 
		else{
			isLeapYear=false;
		}
		if(isLeapYear){
			System.out.println("Year "+year+" is a Leap Year");
		}
		else{
			System.out.println("Year "+year+" is not a Leap Year");
		}
	}
}
