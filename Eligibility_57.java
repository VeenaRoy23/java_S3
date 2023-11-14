import java.util.Scanner;

class AgeException extends Exception
{
	AgeException(String message){
		super(message);
	}
}

class Eligibility_57{
	public static void main(String args[])
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the age:");
		age=s.nextInt();
		if(age>18)
		{
			System.out.println("Eligible to vote");
			
		}
		else{
			try{
				throw new AgeException("Not eligible to vote!");
			}
			catch (AgeException e)
			{
				System.out.println(e);
			}
		}
	}
}
