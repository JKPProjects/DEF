package CoreJavaProgramme;

import java.util.ArrayList;


public class FindCommonElements 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list1= new ArrayList<String>();
		
		list1.add("Hii");
		list1.add("Hlo");
		list1.add("Jaya");
		list1.add("krushna");
		list1.add("pani");
		
		System.out.println(list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("Hii");
		list2.add("Hlo");
		list2.add("Jaya");
		list2.add("krushna");
		list2.add("Liku");
		
		System.out.println(list2);
		
		list2.retainAll(list1);
		System.out.println(list1);	

	}

}
