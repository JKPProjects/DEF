package CoreJavaProgramme;

public class FindLowerUpperDigits 
{

	public static void main(String[] args)
	{
		String str="JAYAkrushna123";
		System.out.println(str.length());
		
		int uppercount=0,lowercount=0,digits=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch))
			
				uppercount++;
				
			else if(Character.isLowerCase(ch))
			
			lowercount++;
			
			else if(Character.isDigit(ch))
				digits++;
		}
		
		
		System.out.println("uppercase letter :" + uppercount);
		System.out.println("lowercase letter :" + lowercount);
		System.out.println("digit :" + digits);
				
		}
				

	}

