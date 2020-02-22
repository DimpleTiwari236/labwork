package vjit;

import java.io.FileReader;
import java.util.Properties;

public class Properties10p1pab 
{

	public static void main(String[] args)throws Exception 
	{
		FileReader fr = new FileReader("E:\Capgemini\Core java\OOPProject\src\vjit\lab10\PersonProps.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println("Name:"+p.getProperty("name"));
		System.out.println("Id:"+p.getProperty("id"));
		System.out.println("Salary:"+p.getProperty("salary"));
		System.out.println("Designation:"+p.getProperty("designation"));
	}

}
