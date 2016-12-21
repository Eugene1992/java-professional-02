package hw3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {
    private MyArrayList<String> myArrayList;
    private String testValue;
    private Integer test;
    private Integer test1;

    @Before
    public void setUp() {
        myArrayList = new MyArrayList<>();
        testValue = "Test Value";
        test=39;

    }

    @Test
    public void testSize() throws Exception {
        for (int i = 0; i < test; i++) {
            myArrayList.add(i,testValue);
        }
        final Integer res = myArrayList.size();
        Assert.assertEquals(test, res);
    }

    @Test
    public void testAdd() throws Exception {
        for (int i = 0; i <= test; i++) {
            myArrayList.add(testValue);
        }
        final String res = myArrayList.get(test);
        Assert.assertEquals(testValue, res);
    }

    @Test
    public void testAdd1() throws Exception {

    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testSet() throws Exception {

    }

    @Test
    public void testContains() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testIterator() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}