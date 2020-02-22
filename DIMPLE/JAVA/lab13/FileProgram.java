package vjit;

import java.io.FileReader;
import java.io.FileWriter;

public class FileProgram extends Thread 
{
	public static void main(String[] args)throws Exception 
	{
		FileReader fi = new FileReader("E:\ source.txt");
		FileWriter fw = new FileWriter("E:\ output.txt");
		CopyDataThread c = new CopyDataThread(fi,fw);
	}
}
