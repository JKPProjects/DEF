package CoreJavaProgramme;

public class CountWords 
{

	public static void main(String[] args) 
	{
		String str="Jaya Krushna Pani";
		int countwords=str.split("\\s").length;
		System.out.println(countwords);

	}

}
