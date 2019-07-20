package packageone;

public class SetoneProgsix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int l=5;
		int count=5;
		for(i=0;i<=count;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
					
			}
			System.out.println(" ");
		}
		for(k=count-1;k>0;k--) {
			for(j=0;j<k;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
