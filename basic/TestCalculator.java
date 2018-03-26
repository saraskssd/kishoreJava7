public class TestCalculator{

	public static void main(String[] args)
	{
	int[] c1=new int[args.length];
	for(int i=0;i<args.length;i++)
		{
			c1[i]=Integer.parseInt(args[i]);
		}
	Calculator c=new Calculator();
	 
	
	System.out.println("Max :"+ c.findMax(c1));
	System.out.println("Min :"+ c.findMin(c1));
	System.out.println("Sum :"+ c.sum(c1));	
	}




}