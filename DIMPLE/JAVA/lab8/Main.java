import java.io.*;
import java.util.Scanner;
public class Main {

public static void main(String[] args) throws FileNotFoundException, IOException {
Scanner scanner = new Scanner(new File("F:\\number.txt"));
String contents = scanner.next();
System.out.println("Original String : " + contents);
//contents = new StringBuffer(contents).toString();
//ByteArrayInputStream b[]=contents.toByteArray();
 String content[]=contents.split(",");
 FileWriter writer = new FileWriter("F:\\output.txt");
 int size = content.length;
 int [] arr = new int [size];
 
 
 for(int i=0; i<size; i++) {
    arr[i] = Integer.parseInt(content[i]);
    if(arr[i]%2==0)
    {
    writer.write(arr[i] +  "");
    System.out.print(arr[i]+" ");
   
    }
     }

//contents = new StringBuffer(contents).reverse().toString();


writer.close();
}
}