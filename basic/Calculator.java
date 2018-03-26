public class Calculator
{
	int findMax(int[] y)
	{
		int max=0;
		if(y>0)
		{
			max=y;
		}	
		{
		for(int e : y)
			{
			if(max >e)
			{
			max=e;
			}
			}
		} 
		return max;
		
	}
	int findMin(int[] y)
	{
		int min=y[0];
		for(int i=0;i<y.length;i++)
		{
		if(min > y[i])
			{
			min=y[i];
			}
		}
		return min;
	}
	int sum(int[] y)
	{
		int sum=0;
		for(int i=0;i<y.length;i++)
		{
		
		sum=sum+y[0];
		}
		return sum;
	} 
}


