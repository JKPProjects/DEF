package CoreJavaProgramme;

import java.util.Scanner;

public class ArmstrongNumber 
{

	public static void main(String[] args)
	{
		int count=0;int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int x=sc.nextInt();
	int y=x;int r=x;
	
	while(x!=0)
	{
		count++;
		x=x/10;
	}
	System.out.println(count);
	
	while(y>0)
	{
		int z=y%10;
		//sum=sum+(z*z*z);
		sum+=Math.pow(z, count);
		y=y/10;	
	}
	if(sum==r)
	System.out.println("Armstrong number");
	else
		System.out.println("Not armstrong number");
	
	}

}
