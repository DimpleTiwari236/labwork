
public class StringSpace {
	public static  void main(String args[])
	{
	Demo d = (String s)-> s.replaceAll("..", "$0  ");
	System.out.println(d.get("helloworld"));
	}

}

interface Demo
{
	String get(String s);
}
