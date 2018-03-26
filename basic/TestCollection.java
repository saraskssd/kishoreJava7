import java.util.*;
public class TestCollection{
	public static void main(String[] args){
	List <Emp> l= new ArrayList<>();
	for(int i=1000;i<=1005;i++){
		Emp e= new Emp(i,"Name"+i,100*i);
		l.add(e);
System.out.println(e.getName()+"  "+e.getSalary()+"  "+e.getId());
	}
	Iteration r=l.iteration();
	System.out.println(l.size());
	while(r.hasNext()){
		Emp d=r.next();
		if(d.getId()==1005){
			r.remove();
		}
		}
	
	}
}