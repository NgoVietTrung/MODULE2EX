package Test;

import BT2.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {
    @Test
    public void testFizz3(){
        int number=3;
        String expected="Fizz";
        String result= FizzBuzz.fizzbuzz(number);
        assertEquals(expected,result);
    }
    @Test
    public void testBuzz5(){
        int number=5;
        String expected="Buzz";
        String result= FizzBuzz.fizzbuzz(number);
        assertEquals(expected,result);
    }
    @Test
    public void testFizzBuzz15(){
        int number=15;
        String expected="FizzBuzz";
        String result= FizzBuzz.fizzbuzz(number);
        assertEquals(expected,result);
    }
    @Test
    public void testFizz4(){
        int number=4;
        String expected="Fizz";
        String result= FizzBuzz.fizzbuzz(number);
        assertEquals(expected,result);
    }
    @Test
    public void testBuzz8(){
        int number=8;
        String expected="Buzz";
        String result=FizzBuzz.fizzbuzz(number);
        assertEquals(expected,result);
    }
    @Test
    public void testFizzBuzz16(){
        int number=16;
        String expected="FizzBuzz";
        String result=FizzBuzz.fizzbuzz(number);
        assertEquals(expected,result);
    }


}
