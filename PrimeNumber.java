package CoreJavaProgramme;

import java.util.Scanner;

public class PrimeNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int x=sc.nextInt();
		
		int count=0;int i=1;
		while(i<=x)
		{
			if(x%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}

	}

}
