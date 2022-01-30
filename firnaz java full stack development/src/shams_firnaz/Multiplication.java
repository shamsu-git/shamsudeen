package shams_firnaz;

import java.util.Scanner;

public class Multiplication {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the val of i :");
		int i=scan.nextInt();
		System.out.println("enter the value of j :");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("multiply of two number:"+mul);
}
}