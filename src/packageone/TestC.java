package packageone;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		A obj1=new A();
		int sum=obj1.add(5,10);
		double sum1=obj1.add(5.2,10.2);
		System.out.println(sum);
		System.out.println(sum1);
		
		E obj2=new E();
		int sum2=obj2.add(4, 5);
		int mul=obj2.multiply(3, 8);
		System.out.println(sum2);
		System.out.println(mul);
		
		
	}

}

class A {
	
	public int x=5;
	protected int y=10;
	int z=7;
	
	
	public A()    //constructor
	{
	x=x+1;
	System.out.println(x);
	}
	
	int add(int a, int b)
	{
		//int z=x+y;
		return a+b;
		//System.out.println(z);
	}
	
	double add(double a, double b)
	{
		//int z=x+y;
		return a+b;
		//System.out.println(z);
	}
}

class E extends A
{
	int multiply(int a,int b)
	{
		return a*b;
	}
	
}