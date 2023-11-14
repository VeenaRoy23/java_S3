class Mat_add_57{
	public static void main(String args[]){
		int A[][]=new int [2][2];
		A[0][0]=10;
		A[0][1]=2;
		A[1][0]=5;
		A[1][1]=6;
	
		int B[][]=new int [2][2];
		B[0][0]=6;
		B[0][1]=4;
		B[1][0]=7;
		B[1][1]=4;
		
		int res[][]=new int [2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				res[i][j]=A[i][j]+B[i][j];
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
