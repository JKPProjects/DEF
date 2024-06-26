package CoreJavaProgramme;

public class Palindrome
{

	public static void main(String[] args) 
	{
		int x=151;int sum=0;int number=x;
		while(x>0)
		{
			int z=x%10;
			sum=(sum*10)+z;
			x=x/10;
		}
		if(sum==number)
		{
			System.out.println("palidrome number");
		}
		else
		{
			System.out.println("not a palidrome number");
		}
	
	}

}
