package hw1;

import org.junit.Assert;

import org.junit.Test;


public class StackTest {






    @Test
    public void testPush() throws Exception {
        Stack stack = new Stack(10);
        stack.push(1);

        stack.push(2);

        stack.push(3);
        Assert.assertEquals(3,stack.pop());
        Assert.assertEquals(2,stack.pop());
        Assert.assertEquals(1,stack.pop());
    }

    @Test
    public void testPop() throws Exception {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        Assert.assertEquals(2,stack.pop());

    }


}
