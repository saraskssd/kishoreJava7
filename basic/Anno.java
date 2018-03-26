interface operation{
	public int operations(int a,int b);
} 
class Annoynms{
	public static void main(String [] args)
	{
	operation p= new operation(){
		public int operations(int a,int b){
		System.out.println("doing addition");
		return a+b;
		}

	};
	System.out.println("Result :"+p.operations(30,70));
	int r=new operation(){
		public int operations(int a,int b){
		System.out.println("doing subtration");
		return a-b;
		}

	}.operations(50,90);
	System.out.println("Result :"+r);
	}
}