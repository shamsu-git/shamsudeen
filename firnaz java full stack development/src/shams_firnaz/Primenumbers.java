package shams_firnaz;

public class Primenumbers {
public static void main(String args[]) {
	int i=0,num=0;
	String primenumbers="";
	for(i=1;i<=100;i++) {
		int counter=0;
		for(num=1;num>=1;num--) {
		if(i%num==0) {
			counter=counter+1;
			
		}
		}
		if(counter==2) {
			primenumbers=primenumbers+i+"";
			
		}}
	System.out.println("1 to 100 prime numbers are");
System.out.println(primenumbers);	}
}