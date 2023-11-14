class Mult_57{
	public static void main(String args[]){
		int sum=0;
		int A[][]=new int [2][3];
		A[0][0]=1;
		A[0][1]=2;
		A[0][2]=5;
		A[1][0]=5;
		A[1][1]=6;
		A[1][2]=7;
		int B[][]=new int [3][3];
		B[0][0]=6;
		B[0][1]=4;
		B[0][2]=5;
		B[1][0]=7;
		B[1][1]=4;
		B[1][2]=5;
		B[2][0]=5;
		B[2][1]=9;
		B[2][2]=5;
		int j;
		int res[][]=new int [2][3];
		
		for(int i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum+=A[i][k]*B[k][j];
				}
				res[i][j]=sum;
				sum=0;
			}
			
		}
		
		
		
		for(int i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for(int i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(B[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for(int i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(res[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}
		
		
