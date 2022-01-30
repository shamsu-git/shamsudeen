package shams_firnaz;

import java.util.Scanner;

public class Areaofsquare {
public static void main(String args) {
	double side;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the sides value:");
	side=input.nextDouble();
	double area=side*side;
	System.out.println("area of square:"+area);
	
}
}
