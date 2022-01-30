package shams_firnaz;

import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String args[]) {
		int i,num=1,counter,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		i=input.nextInt();
		System.out.println("floyds triangle");
		for(counter=1;counter<=5;counter++) {
			for(j=1;j<=5;j++) {
				System.out.print(num+"");
				num++;
			}
			System.out.println();
		}
	}

}
