package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class PrintArrayTest {

    @Test
    public void testCode_IntegerObjectArray_ShouldReturnIntegerArray() {
        Assert.assertEquals("1 2 3 ",PrintArray.arrayPrint(new Object[] {1,2,3}));
    }

    @Test
    public void testCode_DoubleObjectArray_ShouldReturnDoubleArray() {
        Assert.assertEquals("1.1 2.1 3.1 ",PrintArray.arrayPrint(new Object[] {1.1,2.1,3.1}));
    }

    @Test
    public void testCode_CharacterObjectArray_ShouldReturnCharacterArray() {
        Assert.assertEquals("a b c ",PrintArray.arrayPrint(new Object[] {'a','b','c'}));
    }

    @Test
    public void testCode_IntegerObjectArray_ShouldReturnMaximumNumber() {
        int max = PrintArray.maximum( new Integer[] {1,2,3});
        Assert.assertEquals(3,max);
    }

    @Test
    public void testCode_FloatObjectArray_ShouldReturnMaximumNumber() {
        float max = PrintArray.maximum( new Float[] {1.1f,2.1f,3.1f});
        Assert.assertEquals(3.1f,max,0.01);
    }
}
