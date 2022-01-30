package shams_firnaz;

import java.util.Scanner;

public class Findareaofrectangle {
	public static void main(String args[]) {
		double length,width;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length");
		length=input.nextDouble();
		System.out.println("enter the width");
		width=input.nextDouble();
		double area=length*width;
		System.out.println("area of the rectangle is:"+area);
	}

}
