package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class PrintArrayTest {

    @Test
    public void testCode_RunningOrNot_ShouldReturnTrue() {
        Assert.assertEquals(true,PrintArray.arrayPrint(new Object[] {1,2,3}));
    }
}
