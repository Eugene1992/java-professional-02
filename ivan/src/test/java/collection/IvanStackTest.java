package collection;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IvanStackTest {

    private IvanStack<String> stack;

    @Before
    public void before(){
        stack = new IvanStack<>();
    }

    @Test
    public void pushTest() {
        assertEquals(0, stack.size());
        stack.push("one");
        assertEquals(1, stack.size());
        stack.push("two");
        assertEquals(2, stack.size());
        stack.push("three");
        assertEquals(3, stack.size());
    }

    @Test
    public void popTest() {
        stack.push("one");
        stack.push("two");
        stack.push("three");
        assertEquals("one", stack.pop());
        assertEquals("two", stack.pop());
        assertEquals("three", stack.pop());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, stack.size());
        stack.push("one");
        assertEquals(1, stack.size());
    }
}
