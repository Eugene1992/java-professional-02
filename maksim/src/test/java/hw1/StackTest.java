package hw1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class StackTest {

    private Stack<Integer> stack;
    private Integer testValue;

    @Before
    public void setUp() {
        stack = new Stack<>(10);
        testValue = 777;
    }

    @Test
    public void testPush() throws Exception {
        stack.push(testValue);
        final Integer RESULT = stack.pop();
        Assert.assertEquals(testValue, RESULT);
    }

    @Test
    public void testPop() throws Exception {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        Assert.assertEquals(2, stack.pop());
    }

    @Test
    public void testIterator() throws Exception {
        final Iterator<Integer> RESULT = stack.iterator();
        Assert.assertNotNull(RESULT);
    }
}
