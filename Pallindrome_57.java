class Pallindrome_57{
	public static void main(String args[]){
		String str="malayalam";
		String rev_str="";
		char r;
		int i;
		for(i=0;i<str.length();i++)
		{
			r=str.charAt(i);
			rev_str=r+rev_str;
		}
			System.out.println("Reversed string:"+rev_str);
		if(str.equals(rev_str))
			System.out.println("Pallindrome");
		else
			System.out.println("not pallindrome");
	}
}
