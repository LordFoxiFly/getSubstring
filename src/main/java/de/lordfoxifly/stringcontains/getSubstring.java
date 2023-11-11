package de.lordfoxifly.stringcontains;

import java.awt.*;
import java.io.IOException;

import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

public class getSubstring{



    public ArrayList<String> split(String input, String split) throws PatternSyntaxException {
        ArrayList<String> StringList = new ArrayList<>();
        String[] StringArray = input.split(split);
        for (int i = 0; i<StringArray.length; i++){
            StringList.add(StringArray[i]);
        }
        return StringList;

    }
    public int getListIndex(ArrayList InputList, String search) {
        int i;
        for (i = 0; i < InputList.size(); ) {
            if (InputList.get(i).equals(search)) {

                break;
            } else if (i == InputList.size()){
                System.out.println("ERROR: SEARCH ISNT IN THE INPUT STRING");
            }
            else {
                i++;
            }
        }

        return i;
    }
    public String getSubstring(String input, String split, String search){
        ArrayList<String> List = split(input,split);
        int index = getListIndex(split(input,split),search);
        String output ="Confirmation: ] " + Color.red + List.get(index) +  " [ is in the data input";
        return output;
    }
}

