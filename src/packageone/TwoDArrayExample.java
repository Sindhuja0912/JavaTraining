package packageone;

public class TwoDArrayExample {

	public static void main(String[] args) {
		
		//int[][] arr= new int[5][3];
		int[][] empDeptAge= {{10,20,30},{40,23,24,70},{25,45,67,56,34}};
		//System.out.println(empDeptAge[2].length);
		
		for(int i=0;i<empDeptAge.length;i++)
		{
			for(int j=0;j<empDeptAge[i].length;j++)
			{
				System.out.println(empDeptAge[i][j]);
			}
		}
	}

}
