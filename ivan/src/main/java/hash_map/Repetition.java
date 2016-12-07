package hash_map;

import java.util.HashMap;

/**
 *
 */
public final class Repetition {

    private Repetition(){}

    /**
     * It takes a string of words and returns the number of repetitions of the same word
     *
     * @param worlds
     * @return HashMap<String, Integer>: String unique words, Integer the number of repetitions
     */
    public static HashMap<String, Integer> getRepetitionList(String worlds){
        HashMap<String, Integer> dictionary = new HashMap<>();
        worlds = worlds.replaceAll("\\pP|\n", "");
        String[] split = worlds.split(" ");
        int count;
        for (String s: split){
            count = 0;
            if(dictionary.containsKey(s)){
                count = dictionary.get(s);
            }
            dictionary.put(s, ++count);
        }
        return dictionary;
    }

}
