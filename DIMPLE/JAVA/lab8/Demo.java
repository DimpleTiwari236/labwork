import java.io.FileWriter;
public class Demo {
   public static void main(String[] argv) throws Exception {
      FileWriter writer = new FileWriter("E:/input.txt");
      Integer arr[] = { 10, 20, 30, 40, 50 };
      int len = arr.length;
      for (int i = 0; i < len; i++) {
         writer.write(arr[i] + "\t"+ "");
      }
      writer.close();
   }
}