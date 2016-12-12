package com.cbs.edu.io.url;

import java.io.*;
import java.net.URL;

/**
 * Created by evgeniy on 15/09/16.
 */
public class Test {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://flangex.herokuapp.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        BufferedWriter out = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("C:\\Users\\Evgeniy\\Desktop\\java-professional-02\\src\\main\\java\\com\\cbs\\edu\\io\\url\\index")
                )
        );
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            out.write(inputLine);
        }
        out.close();
        in.close();
    }
}
