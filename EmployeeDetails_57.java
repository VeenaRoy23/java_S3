class Employee{
	int empNo;
	String name;
	double basicpay;
	
	Employee(int empNo,String name,double basicpay)
	{
		this.empNo=empNo;
		this.name=name;
		this.basicpay=basicpay;
	}
	
	double grossSalary()
	{
		double DA,HA,grossSalary;
		DA=0.2*basicpay;
		HA=0.005*basicpay;
		grossSalary=basicpay+DA+HA;
		return grossSalary;
	}
	
	
}

class EmployeeDetails_57{
	public static void main(String args[]){
		Employee e1=new Employee(1120,"Anu",12500);
		Employee e2=new Employee(1122,"Thara",15700);
		System.out.println("The gross salary of "+e1.name+" is "+e1.grossSalary());
		System.out.println("The gross salary of "+e2.name+" is "+e2.grossSalary());
	}
}
