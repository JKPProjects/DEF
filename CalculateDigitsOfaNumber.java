package CoreJavaProgramme;

public class CalculateDigitsOfaNumber 
{

	public static void main(String[] args)
	{
		//Approach1
		int i=123456;int count=0;
		while(i!=0) 
		{
			count++;
			i=i/10;
		}
		System.out.println(count);
		
		//Approach2
		int x=456789789;int count1=0;
		while(x>0)
		{
			count1++;
			x=x/10;	
		}
		System.out.println(count1);

	}

}
