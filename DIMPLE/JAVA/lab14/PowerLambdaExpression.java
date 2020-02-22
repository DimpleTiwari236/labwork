

public class PowerLambdaExpression {
    public static void main( String[] args ) {
    
    MyInterface myInterface=(double a,double b)-> {return Math.pow(a,b);};
    System.out.println(myInterface.getPower(1,5));
    }
    
    
    }
@FunctionalInterface
interface MyInterface{
    double getPower(double x,double y);
}

