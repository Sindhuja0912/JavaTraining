package packageone;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String First="Solos";
		StringBuffer sbf=new StringBuffer(First);
		String firstReverse=sbf.reverse().toString();
		if(First.equalsIgnoreCase(firstReverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

}
