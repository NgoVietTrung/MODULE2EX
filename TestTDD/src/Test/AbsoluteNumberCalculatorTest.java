package Test;

import BT2.AbsoluteNumberCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    public void Testnumber1(){
        int number=1;
        int expected=1;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    public void Testnumber2(){
        int number=2;
        int expected=2;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    public void Testnumberam1(){
        int number=-1;
        int expected=1;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    public void Testnumberam1again(){
        int number=-1;
        int expected=-1;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}
