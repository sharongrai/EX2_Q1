package ex2.ex2;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
    /**
     * Rigorous Test :-)
     */
    
	@Test
    public void EX_1_Min(){
    	String res = App.check_num(80);
    	String expected_res = "B";
    	org.junit.Assert.assertEquals(res, expected_res);
       }
	@Test
    public void EX_1_Min_plus_1(){
    	String res = App.check_num(81);
    	String expected_res = "B";
    	org.junit.Assert.assertEquals(res, expected_res);
       }
	@Test
    public void EX_1_Nomi(){
    	String res = App.check_num(85);
    	String expected_res = "B";
    	org.junit.Assert.assertEquals(res, expected_res);
       }
	@Test
    public void EX_1_Max_min_1(){
    	String res = App.check_num(88);
    	String expected_res = "B";
    	org.junit.Assert.assertEquals(res, expected_res);
       }
	@Test
    public void EX_1_Max(){
    	String res = App.check_num(89);
    	String expected_res = "B";
    	org.junit.Assert.assertEquals(res, expected_res);
       }
    
    
}
