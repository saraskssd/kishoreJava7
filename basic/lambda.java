interface a{
	public int operation(int a,int b);
}
class d{
	public static void main(String[] args)
	{
	a c=new a(){
		public int operation(int a,int b){
		return a>=b?a:b;
		} 
	};
	test(c);
	c=((a,b)->a+b);
	test(c);
	test((i,j)->i*j);
	test((i,j)->{ 
		System.out.println("hi");
		return i%j;});
	}
	public static void test(a c){
		System.out.println(c.operation(40,30));
	}
}