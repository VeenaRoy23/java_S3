class Employee{
	String name;
	int age;
	int phoneNo;
	String address;
	double salary;
	
	Employee(String name,int age,int phoneNo,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNo=phoneNo;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary()
	{
		System.out.println("The salary of " + name +" is" + salary);
	}
	
}

class Officer extends Employee{
	String specialization;
	
	Officer(String name,int age,int phoneNo,String address,double salary,String specialization)
	{
		super(name,age,phoneNo,address,salary);
		this.specialization=specialization;
	}
	
	
}

class Manager extends Employee{
	String department;
	
	Manager(String name,int age,int phoneNo,String address,double salary,String department)
	{
		super(name,age,phoneNo,address,salary);
		this.department=department;
	}
	
	
}


class Inheritence_57{
	public static void main(String args[]){
		Officer o1=new Officer("Thara",15,233074,"No.12 MG Street" , 11760,"Market");
		Manager m1=new Manager("Sheeba",25,233232,"No.10 MG Street ", 117680,"Accounts");
		System.out.println(o1.name+"  "+o1.age+"  "+o1.phoneNo+"  "+o1.address+"  "+o1.salary+"  "+o1.specialization);
		System.out.println(m1.name+"  "+m1.age+"  "+ m1.phoneNo+"  " +m1.address+"  "+m1.salary+"  "+m1.department);
		
	}
}








	

