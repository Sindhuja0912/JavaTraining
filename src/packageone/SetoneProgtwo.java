package packageone;

import java.util.Scanner;

public class SetoneProgtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetoneProgtwo cel=new SetoneProgtwo();
		cel.ftoc();
		cel.ctof();
		
	}
	public void ftoc() 
	{
	double c;
	double f;
	double a=0.556;
	int b=32;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the temp:" );
	f=sc.nextDouble();
	c=(f-b)*a;
	System.out.println("Temp in Celsius is: " +c);
	}
	public void ctof()
	{
		double c1;
		double f1;
		double a1=1.8;
		int b1=32;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temp:" );
		c1=sc.nextDouble();
		f1=(c1*a1)+b1;
		System.out.println("Temp in Fahrenheit is: " +f1);	
	}


}
