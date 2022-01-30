package shams_firnaz;

import java.util.Scanner;

public class Triangle {
public static void main(String args[]) {
	double base,height;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the value of base:");
	base=input.nextDouble();
	System.out.println("enter the value of height");
	height=input.nextDouble();
	double area=(base*height)/2;
	System.out.println("area of triangle is:"+area);
	
}
}
