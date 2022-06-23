package Test;

import BT3.Cylinder;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CylinderTest {
    @Test
    public void testvolumewith1010(){
        double radius=10;
        double height=10;
        double area=radius*radius*Math.PI;
        double expected=area*10+2*area;
        double result= Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
    @Test
    public void testAreawith55(){
        double radius=5;
        double height=5;
        double area=radius*radius*Math.PI;
        double expected=20;
        double result= Cylinder.getVolume(radius,height);
        assertEquals(expected,result); ;
    }
}
