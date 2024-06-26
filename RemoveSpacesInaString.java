package CoreJavaProgramme;

public class RemoveSpacesInaString 
{

	public static void main(String[] args)
	{
		String str="Jaya Krushna";
		

		StringBuilder s=new StringBuilder(str);
		char [] charArray=str.toCharArray();
		for (char c : charArray) 
		{
			if (!Character.isWhitespace(c))
				s.append(c);
			
		}
		System.out.println(s);
		
		
	}

}
