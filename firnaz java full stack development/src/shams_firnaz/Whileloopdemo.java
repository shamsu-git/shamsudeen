package shams_firnaz;

import java.util.Scanner;

public class Whileloopdemo {
	public static void main(String args[]) {
		int number,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value below 10");
		number=input.nextInt();
		while(number<=10) {
			number=sum+number;
			number++;
		}
		System.out.format("you entered the values of whileloop:%d",sum);
	}

}
