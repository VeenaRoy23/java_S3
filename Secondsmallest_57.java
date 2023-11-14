class Secondsmallest_57{
	public static void main(String args[]){
		int i,second,k,j;
		int array[]={1,4,2,7,4,9,3};
		
		for(i=1;i<=7;i++)
		{	
			
			for(j=0;j<6-i;j++)
			{
				if(array[i]>array[i+1])
				{
					k=array[i];
					array[i]=array[i+1];
					array[i+1]=k;
				}
			}
		}
		second=array[1];
		System.out.println(second);
	}
}
