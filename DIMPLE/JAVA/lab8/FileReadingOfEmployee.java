import com.cg.eis.pl.*;
import java.io.*;
public class FileReadingOfEmployee {

	public static void main(String[] args) throws IOException {
		 /* FileReader reads text files in the default encoding */
		String line=null;
        FileReader fileReader = new FileReader("E:/output.txt");
        
        /* always wrap the FileReader in BufferedReader */
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }
		
		
        bufferedReader.close();
	}

}
