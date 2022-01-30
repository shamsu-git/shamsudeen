package shams_firnaz;

import java.util.Scanner;

public class ReverseAnumber {
	public static void main(String args[]) {
		int num=0,reversenum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of num:");
		num=input.nextInt();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
			System.out.println("reversenum value is:"+reversenum);
		}		}

}
