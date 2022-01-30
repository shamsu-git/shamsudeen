package shams_firnaz;

import java.util.Scanner;

public class CircleAreaCircumference {
	public static void main(String args[]) {
		double r;
		Scanner input=new Scanner(System.in);
		System.out.println("enter r:");
		r=input.nextDouble();
		double area=Math.PI*(r*r);
		System.out.println("area is:"+area);
		double circumference=Math.PI*2*r;
		System.out.println("circumference is:"+circumference);
	}

}
