class Binary_57{
	public static void main (String args[]){
		int decimal=10;
		int a=decimal;
		int rem,i=0;
		int arr[]=new int[10];
		while(decimal!=0)
		{
			rem=decimal%2;
			arr[i++]=rem;
			decimal=decimal/2;
			
		}
		
		for(int j=i;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
	}
}
		
