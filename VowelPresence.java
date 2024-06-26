package CoreJavaProgramme;

public class VowelPresence
{
	static int vowelcount=0;
	public static void main(String[] args) 
	{
		
		String str="jayakrushna";
		boolean vowelpresent=false;
		
		String str1=str.toLowerCase();
		System.out.println(str1);
		
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u')
			{
				 vowelpresent= true;
				 vowelcount++;
				
			}
		}
	if(vowelpresent)
	{
		System.out.println("No of vowel present : "+ vowelcount);
	}
	else
	{
	    System.out.println("vowel is not present");
	}
	    }
   }


