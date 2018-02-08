package week1.day3;

import java.util.Scanner;

public class ArithmeticOperation {


	public static void main(String[] args) {
		int firstNo,secondNo;
		String action="add,subtract,multiply,divide";
		System.out.println("Enter the First number:");
		Scanner fNo=new Scanner(System.in);
		firstNo=fNo.nextInt();
		System.out.println("Enter the Second number:");
		Scanner sNo=new Scanner(System.in);
		secondNo=sNo.nextInt();
		System.out.println("Enter the Operation to be performed:");
		Scanner aOperation=new Scanner(System.in);
		action=aOperation.next();
		fNo.close();
		sNo.close();
		aOperation.close();
		switch(action){
		case "add":
			System.out.println("Sum of given numbers:"+(firstNo+secondNo));
			break;
		case "subtract":
			System.out.println("Subtraction of given numbers:"+(firstNo-secondNo));
			break;
		case "multiply":
			System.out.println("Multiplication of given numbers:"+(firstNo*secondNo));
			break;
		case "divide":
			System.out.println("Division of given numbers:"+(firstNo/secondNo));
			break;
		default:
			System.out.println("Invalid Input!!");
			break;

		}		}
}

