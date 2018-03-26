public class Multiple
{
	int findMul(int[] ass){
		int mul=1;
		for(int i : ass)
		{
			mul*=i;
		}
		return mul;
	}
}

class TestMul{
	public static void main(String[] args)
	{
		int[] a=new int[args.length];
		for(int e=0;e<args.length ;e++)
		{
			a[e]=Integer.parseInt(args[e]);
		}
		Multiple m= new Multiple();
		System.out.println(m.findMul(a));
	}


}