package hw5;



/**
 * Created by User on 23/12/2016.
 */
public class SavePicturesTest {
    public static void main(String[] args) {
        String url = "http://flangex.herokuapp.com/io/load";
        String fileName = "C:\\Users\\User\\Desktop\\";
        new SavePictures().saveFromURL(url,fileName);

    }
}
