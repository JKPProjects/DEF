package CoreJavaProgramme;

import java.util.Scanner;

public class FactorialNumber 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		int sum=1;
		
		
		//Approach1
//		int n=8;int sum=1;
//		for(int i=1;n>=i;)
//		{
//			sum=sum*n;
//			n=n-1;	
//		}
//		System.out.println(sum);
		
		//Approach2
		while(x>0)
		{
			sum=sum*x;
			x=x-1;
			
		}
		System.out.println(sum);
		
	}
	
	 
}

