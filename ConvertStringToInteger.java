package CoreJavaProgramme;

public class ConvertStringToInteger
{

	public static void main(String[] args) 
	{
		//Approach1
		String str="12345";
		Integer i=Integer.parseInt(str);
		System.out.println(i);
		//Approach2
		String str1="23456";
		Integer y=Integer.valueOf(str1);
		System.out.println(y);
		
	}

}
