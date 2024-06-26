package CoreJavaProgramme;

public class SumOfArrayElements 
{

	public static void main(String[] args) 
	{
		int sum=0;
		int [] x= {1,2,3,4,5};
     	System.out.println(x.length);
		System.out.println(x[1]);
		
		for(int i=0;i<x.length;i++)
		{
			
			 sum=sum+x[i];
			 
		}
		System.out.println(sum);

	}

}
