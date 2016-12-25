package list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Gleb on 12.12.2016.
 */
public class SpeedListTest {

    private SpeedList<String> testArray;
    private String testWords;
    private String testWordsTwo;
    private String testWordsThree;

    @Before
    public void setUpArrayLis() {
        testArray = new SpeedList<>();
        testWords = "Gleb";
        testWordsTwo = "Tarasevich";
        testWordsThree = "Vadimovich";

    }

    @Test
    public void add() throws Exception {
        testArray.add(testWords);
        final String EXPECTED_RESULT = testArray.get(0);
        Assert.assertEquals(testWords, EXPECTED_RESULT);
    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void set() throws Exception {

    }

    @Test
    public void size() throws Exception {
        int size = testArray.size();
        for (int i = 0; i < 10; i++) {
            testArray.add(testWords);
        }

        Assert.assertNotEquals(size, testArray.size());
        System.out.println( "StartSize " + size + " FinalSize " + testArray.size());

    }

    @Test
    public void indexOf() throws Exception {
      testArray.add(testWordsTwo);
        System.out.println(testArray.indexOf(testWordsTwo));
      testArray.add(0, testWords);
      testArray.add(testWordsThree);
        System.out.println(testArray.indexOf(testWordsTwo));
    }

    @Test
    public void add1() throws Exception {
        testArray.add(testWords);
        testArray.add(0, testWordsTwo);
        final String EXPECTED_RESULT_ADD = testArray.get(0);
        Assert.assertEquals(testArray.get(0), EXPECTED_RESULT_ADD);
        System.out.println(testArray.get(0) + " " + testArray.get(1));
    }

    @Test
    public void remove() throws Exception {
        testArray.add(testWords);
        testArray.add(testWordsTwo);
        System.out.println(testArray.get(0) + " testWords");
        final String EXPECTED_RESULT = testArray.get(0);
        testArray.remove(0);
        Assert.assertNotEquals(testArray.get(0), EXPECTED_RESULT);
        System.out.println(" " +testArray.get(0)+ " removeWords");
    }

}