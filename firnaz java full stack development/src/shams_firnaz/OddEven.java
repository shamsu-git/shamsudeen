package shams_firnaz;

import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
		int num;
		Scanner input =new Scanner(System.in);
		System.out.println("enter an number:");
		num=input.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
