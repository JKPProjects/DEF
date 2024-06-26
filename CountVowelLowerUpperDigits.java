package CoreJavaProgramme;

public class CountVowelLowerUpperDigits 
{
	static int vowelcount=0;
	public static void main(String[] args) 
	{
		int lowercount=0,uppercount=0,digits=0;
		String str="jayaKRUSHNApani123";
		String s=str.toLowerCase();
		boolean vowelpresent = false;


		for(int i=0;i<s.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
			{
				lowercount++;
			}
			else if(Character.isUpperCase(ch))
			{
				uppercount++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				vowelpresent=true;
				break;

			}
		}

			if(vowelpresent)
			{
				System.out.println(" vowel  is present" );
			}
			else
			{
				System.out.println("vowel is not present");

			}
		
		System.out.println("no of lowercase :" + lowercount);
		System.out.println("no of uppercase :" + uppercount);
		System.out.println("no of digits :" + digits);

	}

}