package hw3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class MyArrayListTest {
    private MyArrayList<Integer> myArrayList;
    private int testValue;
    private int newValue;
    private int test;


    @Before
    public void setUp() {
        myArrayList = new MyArrayList<>();
        testValue = 10;
        newValue=11;
        test=10;

    }

    @Test
    public void testSize() throws Exception {
        for (int i = 0; i < test; i++) {
            myArrayList.add(i);
        }
        final int res = myArrayList.size();
        Assert.assertEquals(test, res);
    }

    @Test
    public void testAdd() throws Exception {
        for (int i = 0; i <= test; i++) {
            myArrayList.add(i);
        }
        final int res = myArrayList.get(test);
        Assert.assertEquals(testValue, res);
    }

    @Test
    public void testAdd1() throws Exception {
        for (int i = 0; i <= test; i++) {
            myArrayList.add(i,i);
        }
        final int res = myArrayList.get(test);
        Assert.assertEquals(testValue, res);
    }

    @Test
    public void testGet() throws Exception {
        for (int i = 0; i <= test; i++) {
            myArrayList.add(testValue);
        }

        final int res = myArrayList.get(test);
        Assert.assertEquals(testValue, res);
    }

    @Test
    public void testSet() throws Exception {
        for (int i = 0; i <= test; i++) {
            myArrayList.add(i);
        }
        final int res = myArrayList.set(test, newValue);
        Assert.assertEquals(newValue, res);
    }

    @Test
    public void testContains() throws Exception {
        for (int i = 0; i <= test; i++) {
            myArrayList.add(i);
        }
        final boolean res = myArrayList.contains(testValue);
        Assert.assertEquals(true, res);
    }

    @Test
    public void testRemove() throws Exception {
        for (int i = 0; i <= newValue; i++) {
            myArrayList.add(i);
        }
        myArrayList.remove(newValue);
        final boolean res = myArrayList.contains(testValue);
        Assert.assertEquals(true, res);
    }

    @Test
    public void testIterator() throws Exception {
        final Iterator<Integer> RESULT = myArrayList.iterator();
        Assert.assertNotNull(RESULT);
    }

    @Test
    public void testToString() throws Exception {

    }
}