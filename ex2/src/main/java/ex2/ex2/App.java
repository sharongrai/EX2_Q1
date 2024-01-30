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
    	if (n<1){
    		return "ERROR";	
    	}
    	else if (n >= 1 && n<=49){
    		return "F";	
    	}
    	else if (n >= 50 && n<=59){
    		return "E";	
    	}
    	else if (n >= 60 && n<=69){
    		return "D";	
    	}
    	else if (n >= 70 && n<=79){
    		return "C";	
    	}
    	else if (n >= 80 && n<=89){
    		return "B";	
    	}
    	else if (n >= 90 && n<=100){
    		return "A";	
    	}
    	else {
    		return "ERROR";	
    	}
    	
    }
    
}
