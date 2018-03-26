public class Emp{
	private int id;
	private String name;
	private double salary;
	public Emp(){}
	public Emp(int id,String name,double salary){
		this.id=id ;
		this.name=name;
		this.salary=salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
}