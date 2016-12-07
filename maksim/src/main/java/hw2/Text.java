package hw2;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 07/12/2016.
 */
public class Text {

    String text;

    public Text(String text) {
        this.text=text;

    }




    public Map <String,Integer> maptosort(){
        Map< String,Integer> map = new HashMap<>();
        String [] array = text.split(" ");
        for (int i =0; i>=array.length;i++){
            if (!map.containsKey(array[i]))
            map.put(array[i],1);
            else {
                map.put(array[i],map.get(array[i])+1);
            }

        }

        return map;
    }





}