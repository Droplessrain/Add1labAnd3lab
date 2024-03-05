package tests;

import main.*;
import org.junit.*;

public class BinaryTest {
    @Test
    public void BinarySimpleTest(){
        int array[] = new int[]{1, 2, 3, 4, 5};
        int searchNumber = 4;
        int expected = 3;
        Assert.assertEquals(expected, Binary.binarySearch(array, searchNumber));
    }
    @Test
    public void BinaryReversSimpleTest(){
        int array[] = new int[]{5, 4, 3, 2, 1};
        int searchNumber = 4;
        int expected = -1;
        Assert.assertEquals(expected, Binary.binarySearch(array, searchNumber));
    }
    @Test
    public void BinaryMissingNumberTest(){
        int array[] = new int[]{1, 2, 3, 4, 5};
        int searchNumber = 6;
        int expected = -1;
        Assert.assertEquals(expected, Binary.binarySearch(array, searchNumber));
    }
}
