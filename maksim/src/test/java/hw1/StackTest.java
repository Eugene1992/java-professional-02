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
        stack = new Stack<>();
        testValue = 777;
    }

    @Test
    public void testPush() throws Exception {
        for (int i = 1; i <= testValue; i++) {
            stack.push(i);
        }
        final Integer RESULT = stack.pop();
        Assert.assertEquals(testValue, RESULT);
    }

    @Test
    public void testPop() throws Exception {

        for (int i = 1; i <= testValue; i++) {
            stack.push(i);
        }
        final Integer RESULT1=stack.pop();
        Assert.assertEquals(testValue, RESULT1);
    }

    @Test
    public void testIterator() throws Exception {
        final Iterator<Integer> RESULT = stack.iterator();
        Assert.assertNotNull(RESULT);
    }
    @Test
    public  void  testSize() throws Exception{
        for (int i = 1; i <= testValue; i++) {
            stack.push(i);
        }
        final Integer res = stack.size();
        Assert.assertEquals(testValue, res);
    }

}
