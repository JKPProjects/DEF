package CoreJavaProgramme;

public class ReverseStringUsingStringBuilder 
{

	public static void main(String[] args)
	{
		String str="Jayakrushna";
		StringBuilder sb=new StringBuilder(str);
		String str1=sb.reverse().toString();
		System.out.println(str1);

	}

}
