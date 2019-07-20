package packageone;

import java.util.Scanner;

public class SetoneProgfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		long yr=sc.nextLong();
		long c=yr%4;
		if(c==0) 
		{
			System.out.println("The given year is a leap year");
		}
		else
		{
			System.out.println("The given year is not a leap year");
		}
	
		
	}

}
