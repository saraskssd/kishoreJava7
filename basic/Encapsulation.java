public class Encapsulation{
	private int age;
	private String name;
	private int id;
	public void display(int id,String name,int age){
		this.id=id;
		
		this.name=name;
		
		setAge(age);
	}
	public void setName(String a){
		name=a;
	}
	public void setAge(int age){
		if(age>=1 && age<=60)
		{
			this.age=age;
		}
	}
	public void flow(){
	System.out.println("Name: "+name+"Age :"+age+"Id :"+id);
	}
}
class Customer{
	public static void main(String[] args)
	{
		Encapsulation e=new Encapsulation();
		e.display(121,"Sat",19);
		e.flow();
		e.setName("Saras");
		e.flow();
	}
}