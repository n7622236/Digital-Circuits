package Digital;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class ORGateTest 
{
    private ORGate instance;  
    private TestTerminal input0, input1, input2;    
    private Terminal output;
    
    @Before
    public void setUp() {
        instance = new ORGate();
        output = instance.getOutput();
        input0 = new TestTerminal();
        input1 = new TestTerminal();   
        input2 = new TestTerminal();         
    }
    
    @Test
    public void testOutput() { 
        Terminal output = instance.getOutput();
        assertTrue(output != null);
        assertTrue(output.getClass() == OutputTerminal.class);  
    }         
    
@Test
    public void testInput0() {
        instance.setInput0(input0);
        Terminal result = instance.getInput0();
        assertEquals("get input0 should return the Terminal set by setInput0", input0, result);
    }    
    
    @Test
    public void testInput1() {
        instance.setInput1(input1);
        Terminal result = instance.getInput1();
        assertEquals("get input1 should return the Terminal set by setInput1", input1, result);
    }    
    
    @Test
    public void testBothTrue() {
        input0.setValue(true);
        input1.setValue(true);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals("true OR true should generate true", true, output.getValue());
    }
    
    @Test
    public void testTrueOrFalse() {
        input0.setValue(true);
        input1.setValue(false);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals("true OR false should generate true", true, output.getValue());
    }
    
    @Test
    public void testFalseOrTrue() {
        input0.setValue(false);
        input1.setValue(true);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals("false OR true should generate true", true, output.getValue());
    }
    
    @Test
    public void testBothFalse() {
        input0.setValue(false);
        input1.setValue(false);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals("false OR false should generate false", false, output.getValue());
    }     
  
    @Test
    public void testNoInputs() {
        assertEquals("if one of the inputs is not connected then that input value should be treated as false", false, output.getValue());
    }      
    
    @Test
    public void testInput0ValueChanged() {
        input0.setValue(true);
        input1.setValue(false);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals(output.getValue(), true);
        
        input0.setValue(false);
        assertEquals("if the value of input0 changes then the output of the OR gate needs to be recomputed", false, output.getValue());        
    }    
    
    @Test
    public void testInput0Changed() {
        input0.setValue(true);
        input1.setValue(false);
        input2.setValue(false);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals(output.getValue(), true);
        
        instance.setInput0(input2);
        assertEquals("if input0 is connected to a different output terminal then the output of the OR gate needs to be recomputed", false, output.getValue());        
    }   
    
    @Test
    public void testInput0Cleared() {
        input0.setValue(true);
        input1.setValue(false);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals(output.getValue(), true);
        
        instance.setInput0(null);
        assertEquals("if input0 is disconnected then the output of the OR gate needs to be recomputed", false, output.getValue());        
    }     
    
    @Test
    public void testInput1ValueChanged() {
        input0.setValue(false);
        input1.setValue(true);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals(output.getValue(), true);
        
        input1.setValue(false);
	assertEquals("if the value of input1 changes then the output of the OR gate needs to be recomputed", false, output.getValue());
    }    
    
    @Test
    public void testInput1Changed() {
        input0.setValue(false);
        input1.setValue(true);
        input2.setValue(false);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals(output.getValue(), true);
        
        instance.setInput1(input2);
        assertEquals("if input0 is connected to a different output terminal then the output of the OR gate needs to be recomputed", false, output.getValue());        
    } 
    
    @Test
    public void testInput1Cleared() {
        input0.setValue(false);
        input1.setValue(true);
        instance.setInput0(input0);
        instance.setInput1(input1);
        assertEquals(output.getValue(), true);
        
        instance.setInput1(null);
        assertEquals("if input1 is disconnected then the output of the OR gate needs to be recomputed", false, output.getValue());        
    }     
}