package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtilsTest {
//    @Test
//    public void getSumTest() {
//        // : Given
//        Integer input = 5;
//        Integer expected = 15;
//
//        // : When
//        Integer actual = IntegerUtils.getSumOfN(input);
//
//        // : Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    Per the instructions, the test should sum all integers up to and not including n. The correct sum is 10, not 15 (1+2+3+4 = 10). Rewrote test below:

    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        Integer expected = 10;

        // : When
        Integer actual = IntegerUtils.getSumOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testGetProduct() {
//        // : Given
//        Integer input = 5;
//        Integer expected = 120;
//
//        // : When
//        Integer actual = IntegerUtils.getProductOfN(input);
//
//        // : Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    As with the getSum test, the instructions said to get the product of numbers 1 through 'n' NOT including 'n'. The correct product is 24 (1*2*3*4 = 24). Rewrote test below:

    @Test
    public void testGetProduct() {
        // : Given
        Integer input = 5;
        Integer expected = 24;

        // : When
        Integer actual = IntegerUtils.getProductOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
