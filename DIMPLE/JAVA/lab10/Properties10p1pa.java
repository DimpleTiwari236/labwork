package vjit;
import java.io.*;
import java.util.Properties;

public class Properties10p1pa 
{

	public static void main(String[] args)throws Exception 
	{
		FileReader fr = new FileReader("E:/Capgemini/Core java/OOPProject/src/vjit/lab10/PersonProps.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println("Values stored in properties are:");
		System.out.println(p);
	}

}
