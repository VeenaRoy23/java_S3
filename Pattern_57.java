import java.util.Scanner;
class Pattern_57{
	public static void main (String args[]){
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("Enter the length");
		a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
}

