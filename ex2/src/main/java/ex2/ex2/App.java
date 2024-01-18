package ex2.ex2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static String check_num(int n)
    {
    	if (n >= 1 && n<=49){
    		return "f";	
    	}
    	if (n >= 70 && n<=79){
    		return "c";	
    	}
		return null;
    	
    }
}
