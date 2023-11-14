class Frequency_57{
	public static void main(String args[]){
		String str="malayalam";
		char id='l';
		char c;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(c==id)
				count++;
		}
		System.out.println(count);
	}
}
