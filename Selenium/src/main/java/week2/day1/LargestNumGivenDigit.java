package week2.day1;

import java.util.Scanner;

public class LargestNumGivenDigit {

	public static void main(String[] args) {
		int getNumber;
		int getDigit;	
		Scanner number=new Scanner(System.in);
		getNumber=number.nextInt();
		number.close();
		Scanner digit=new Scanner(System.in);
		getDigit=digit.nextInt();
		digit.close();
		char c = Integer.toString(getDigit).charAt(0);
		//Decrementing number & checking whether it contains digit
		for (int i = getNumber; i > 0; --i)
		{
			if(Integer.toString(i).indexOf(c) == -1)
			{
				//If 'i' doesn't contain 'c'

				System.out.println("Largest Number Less Than Given Number And Without A Given DIgit is"+i);

			}
			i= getNumber-1;
		}

	}

}

