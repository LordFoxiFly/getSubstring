package de.lordfoxifly.stringcontains;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        String testString = "This is ur data input, here u can put ur data in";

        getSubstring gS = new getSubstring();

        String searchConfirmation =   gS.getSubstring(testString, ",", "This is ur data input");

        //.getSubstring will comfirm u that the String is in the data input

        System.out.println(searchConfirmation);

        Integer ListIndex = gS.getListIndex(gS.split(testString, ","),"This is ur data input");

        //.getIndex will get u the ListIndex(Index of the Arraylist) of the data
        //.split will split the String into a Arraylist

        System.out.println(ListIndex);

    }
}
