import java.util.*;
import java.util.function.*;
public class UserNamePassword
{
public static void main(String[] args)
{
    
Scanner sc=new Scanner(System.in);
System.out.println("Enter user name");
String u=sc.next();
System.out.println("Enter password");
String p=sc.next();
    
BiPredicate<String, String> str = (user,pwd)->{if(user.equals("system") && pwd.equals("root"))
                                                        return true;
                                                       else
                                                        return false;};
System.out.println("The user name and password are " +str.test(u,p));
}
	
}