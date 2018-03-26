class Poly{
	int add(int a,int b){
		return (a+b);
	}
}
class Hex extends Poly{
	double add(int a,double b){
		System.out.println(super.add(12,8));
		return a*b;
	}
}
class Tri extends Hex{
	String add(String a,String b){
		return a+b;
	}
}

class joy{
	public static void main(String[] args){
		Poly p= new Poly();
		Hex h=new Hex();
		Tri t=new Tri();
                System.out.println(p.add(12,12));
		System.out.println(h.add(12,(double)12));
		System.out.println(t.add("Hi","GD"));
	}
}