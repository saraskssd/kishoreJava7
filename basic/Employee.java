class Employee
{
	int empId;
	String empName,gender;
	double salary;
	Employee(int empId,String empName,double salary,String gender)
	{
	this.empId=empId;
	this.empName=empName;
	this.salary=salary;
	this.gender=gender;
	}
	void display()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
		System.out.println("Gender : "+gender);
	}
	void updateSalary(double s)
	{
		double per=salary+s;
		System.out.println("Updated Salary : "+per);
	}
	void raiseSalary()
	{
		double ras=(salary*0.05)+(salary);
		System.out.println("Raised Salary : "+ras);
	}


}
class Details
{
	public static void main(String args[])
	{
		Employee e1=new Employee(101,"saras",20000,"female");
		Employee e2=new Employee(102,"saranya",30000,"female");
		Employee e3=new Employee(103,"satheesh",40000,"male");
		e1.display();
		e1.raiseSalary();
		e1.updateSalary(4000);
		e2.display();
		e2.raiseSalary();
		e2.updateSalary(2000);
		e3.display();
		e3.raiseSalary();
		e3.updateSalary(8000);


	}
}