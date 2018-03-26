class Person{
	public void display(){
		System.out.println("Personal Information");
		}
}
class Employee extends Person{
	public void display(){
		System.out.println("Employee Information");
		}
}
class Manager extends Employee{
	public void display(){
		System.out.println("Manager Information");
		}
}

class TestOverriding{
	public static void main(String[] args){
		Employee e=new Employee();
		Person p=new Person();
		Manager m=new Manager();
		test(e); test(p); test(m);
		}
	public static void test(Person p){
		p.display();
		}
}