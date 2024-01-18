package ex2.ex2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
    /**
     * Rigorous Test :-)
     */
    @Test
   
    public void EX_1_MIN(){
    	String res = App.check_num(10);
    	String expected_res = "c";
    	org.junit.Assert.assertEquals(res, expected_res);;
       }
    
}
