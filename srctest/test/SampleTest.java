package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest{
    @Test
    public void testAppendComma(){
        Sample sample = new Sample();
        String retValue = sample.appendComma("abc");
        assertEquals("abc,", retValue);
    }
    
    @Test
    public void testNull(){
        String a = null;
        assertNull(a);
    }
    
    void testThrowsException() throws Exception {
    	Example1 target = new Example1();
//    	Assertions.assertThrows(Exception.class, target.execute(null));
    }
    
    
}