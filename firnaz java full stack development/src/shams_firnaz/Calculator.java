package shams_firnaz;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the number:");
		num1=input.nextInt();
		System.out.println("please enter the another number:");
		num2=input.nextInt();
		sum=num1+num2;
		System.out.println("addition of two numbers is..."+sum);
		
	}

}
