import java.io.*;
class FileRead_57{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin=null;
		FileOutputStream fodd=null;
		FileOutputStream feven=null;
		
		int i;
		String str="";
		
		if (args.length!=3)
		{
			System.out.println("Enter three files");
		}
		else
		{
			try
			{
				fin=new FileInputStream(args[0]);
				feven=new FileOutputStream(args[1]);
				fodd=new FileOutputStream(args[2]);
				while((i=fin.read())!=-1)
				{
					if((char)i!='\n')
					{
						str=str+(char)i;
					}
					else
					{
						System.out.println(str);
						int num=Integer.parseInt(str);
						if(num%2==0)
						{
							feven.write(str.getBytes());
							feven.write("\n".getBytes());
						}
						else
						{
							fodd.write(str.getBytes());
							fodd.write("\n".getBytes());
						}
						str="";
					}
				}
			}
			catch(FileNotFoundException f)
			{
				System.out.println(f);
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		
		finally{
			if(fin!=null)
				fin.close();
			if(feven!=null)
				feven.close();
			if(fodd!=null)
				fodd.close();
			}
		}
	}
}
				
	
	
