class Transpose_57{
	public static void main(String args[]){
		int A[][]=new int [2][3];
		A[0][0]=1;
		A[0][1]=2;
		A[0][2]=5;
		A[1][0]=5;
		A[1][1]=6;
		A[1][2]=7;
		int trans[][]=new int [3][2];
		
		System.out.println("The matrix is\n");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
	
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				trans[j][i]=A[i][j];
			}
		}
		
		System.out.println("The transpose matrix is\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(trans[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
