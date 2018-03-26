interface x{
	public int add(int a,int b);
}
interface y{
	public int sub(int a,int b);
}
interface z extends x,y{
	public int mul(int a,int b);
}
class a implements z{
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
}
class b
{
	public static void main(String[] args){
		x x1=new a();
		System.out.println(x1.add(30,80));
		z x2=new a();
		x2.sub(20,8);
	}
}