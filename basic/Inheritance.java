class Person{
	public String name;
	public int age=22;
	Person(){
		System.out.println("In Person");
	}
	Person(String name)
	{
		System.out.println(name);
	}
	public void display(String name, int age){
		System.out.println("Name :"+name+" Age :"+age);
	}
}
class Employee extends Person{
	int Id,age;
	double Salary;
	Employee()
	{
		super("Hi");
		
		System.out.println("In Employee");
	}
	void display(int Id,double Salary)
	{
	
	System.out.println("Id :"+Id+" superAge :"+super.age+" Salary :"+Salary);
	}	
	
}
class Inheritance{
	public static void main(String[] args){
		Person p= new Employee();
		Employee e=new Employee();
		p.display("Ginger",100);
		e.display(121,1200.9);
	}
}