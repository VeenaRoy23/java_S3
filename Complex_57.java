class Complex{
	int real;
	int imaginary;
	
	Complex(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	void product(Complex o)
	{
		int realPart;
		int imagPart;
		realPart=(real*o.real)-(imaginary*o.imaginary);
		imagPart=(real*o.imaginary)+(imaginary*o.real);
		System.out.println("The product is "+ realPart+" + "+imagPart+"i");
	}
}

 class Complex_57{
 	public static void main(String args[]){
 		Complex c1=new Complex(10,4);
 		Complex c2=new Complex(4,7);
 		c2.product(c1);
 	
 	}
 }
 
