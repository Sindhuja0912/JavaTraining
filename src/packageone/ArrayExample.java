
package packageone;

public class ArrayExample {

	public static void main(String[] args) {
		int evenCounter=0;
		int oddCounter = 0;
		int[] empAge= {10,20,30,40,23,24,25,45,67,32,19};
		for(int i = 0;i<empAge.length;i++)
		{
		if (empAge[i]%2==0)
		{
		
		evenCounter++;
		}
		else
		{
		oddCounter++;
		}

}
		System.out.println("Even count is " +evenCounter);
		System.out.println("Odd count is " +oddCounter);
	
}
}