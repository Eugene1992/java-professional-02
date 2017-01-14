package list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Gleb on 12.12.2016.
 */
public class SpeedListListTest {

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

    @Test(expected = IllegalArgumentException.class)
    public void get() throws Exception {
        final int NEGATIVE_INDEX = -1;
        testArray.get(NEGATIVE_INDEX);
    }

    @Test
    public void set() throws Exception {
        testArray.add(testWords);
        testArray.set(0, testWordsThree);
        final String EXPECTED_RESULT = testArray.get(0);
        Assert.assertNotEquals(EXPECTED_RESULT, testWords);
    }

    @Test
    public void size() throws Exception {
        int size = testArray.size();
        testArray.add(testWords);
        Assert.assertNotEquals(size, testArray.size());
    }

    @Test
    public void indexOf() throws Exception {
        for (int i = 0; i < 5; i++) {
            testArray.add(testWordsTwo);
        }
        final int INDEX = 3;
        testArray.add(INDEX, testWords);
        final int EXPECTED_INDEX = testArray.indexOf(testWords);
        Assert.assertEquals(INDEX, EXPECTED_INDEX);
    }

    @Test
    public void addInsert() throws Exception {
        testArray.add(testWords);
        testArray.add(0, testWordsTwo);
        final String EXPECTED_RESULT_ADD = testArray.get(0);
        Assert.assertEquals(testArray.get(0), EXPECTED_RESULT_ADD);
    }

    @Test
    public void remove() throws Exception {
        testArray.add(testWords);
        testArray.add(testWordsTwo);
        final String EXPECTED_RESULT = testArray.get(0);
        testArray.remove(0);
        Assert.assertNotEquals(testArray.get(0), EXPECTED_RESULT);
    }

}