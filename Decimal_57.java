class Decimal_57{
	public static void main (String args[]){
		int binary=1100;
		int x=binary;
		int add=1;
		int dec=0;
		while(binary!=0)
		{
			int rem=binary%10;
			dec=dec+(rem*add);
			binary=binary/10;
			add=add*2;
		}
		System.out.println("The decimal of "+ x +" is "+ dec);
	}
}
			
