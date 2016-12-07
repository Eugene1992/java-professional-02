package hath_map;

import hash_map.Repetition;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class RepetitionTest {

    @Test
    public void withOneWordTest() {
        HashMap<String, Integer> worlds = Repetition.getRepetitionList("one one one");
        assertEquals(worlds.size(), 1);
        assertEquals(worlds.get("one"), (Integer) 3);
    }

    @Test
    public void withFiveWordTest() {
        HashMap<String, Integer> worlds = Repetition.getRepetitionList("one two two three three three four four four four five five five five five");
        assertEquals(worlds.size(), 5);
        assertEquals(worlds.get("one"), (Integer) 1);
        assertEquals(worlds.get("two"), (Integer) 2);
        assertEquals(worlds.get("three"), (Integer) 3);
        assertEquals(worlds.get("four"), (Integer) 4);
        assertEquals(worlds.get("five"), (Integer) 5);
    }

    @Test
    public void withFiveWordWithPunctuationMarksTest() {
        HashMap<String, Integer> worlds = Repetition.getRepetitionList("one, two, two. three- three, \nthree, four, four, four. four. five. five. five. five. five,");
        assertEquals(worlds.size(), 5);
        assertEquals(worlds.get("one"), (Integer) 1);
        assertEquals(worlds.get("two"), (Integer) 2);
        assertEquals(worlds.get("three"), (Integer) 3);
        assertEquals(worlds.get("four"), (Integer) 4);
        assertEquals(worlds.get("five"), (Integer) 5);
    }
}
