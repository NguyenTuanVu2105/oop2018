package week3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(10,Week3.max(10,5));
        assertEquals(1000,Week3.max(1000,1));
        assertEquals(500,Week3.max(500,499));
        assertEquals(-10,Week3.max(-10,-100));
        assertEquals(0,Week3.max(0,-5000));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] arr1 = {6,2,3,4,5,1};
        int[] arr2 = {-6,-5,-4,-3,-2,-1};
        int[] arr3 = {1};
        int[] arr4 = {0,1,0,2,0,4,0,0};
        int[] arr5 = {1,2,3,4,4,3,2,1,0,-1000};
        assertEquals(1,Week3.minOfArray(arr1));
        assertEquals(-6,Week3.minOfArray(arr2));
        assertEquals(1,Week3.minOfArray(arr3));
        assertEquals(0,Week3.minOfArray(arr4));
        assertEquals(-1000,Week3.minOfArray(arr5));

    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Béo phì",Week3.calculateBMI(70,1.6));
        assertEquals("Thiếu cân",Week3.calculateBMI(50,1.7));
        assertEquals("Bình thường",Week3.calculateBMI(60,1.65));
        assertEquals("Bình thường",Week3.calculateBMI(70,1.9));
        assertEquals("Thừa cân",Week3.calculateBMI(80,1.8));

    }
}
