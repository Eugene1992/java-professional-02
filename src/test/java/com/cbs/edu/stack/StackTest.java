package com.cbs.edu.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<String> stack;
    private String testValue;

    @Before
    public void setUp() {
        stack = new Stack<String>();
        testValue = "Hello world!";
    }

    @Test
    public void getSizeTest() throws Exception {
        final int EXPECTED_SIZE = 1;
        Stack<String> stringStack = new Stack<String>();
    }

    @Test
    public void push() throws Exception {
        stack.push(testValue);
        final String RESULT = stack.pop();
        Assert.assertEquals(testValue, RESULT);
    }

    @Test
    public void pop() throws Exception {

    }

    @Test
    public void iterator() throws Exception {

    }

}