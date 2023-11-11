# getSubstring
This is a Java repo that can fetch your data. Input your data and get your the index of a substring or check if the substring 
exists. 

# Total Overview
```Java

public class Main{

    public static void main(String[] args) throws IOException {
        String testString = "This is ur data input, here u can put your data in";

        getSubstring gS = new getSubstring();

        String searchConfirmation = gS.getSubstring(testString, ",", "This is your data input");

        //.getSubstring will comfirm u that the String is in the data input

        System.out.println(searchConfirmation);

        Integer ListIndex = gS.getListIndex(gS.split(testString, ","),"This is your data input");

        //.getIndex will get u the ListIndex(Index of the Arraylist) of the data
        //.split will split the String into a Arraylist

        System.out.println(ListIndex);

        Integer TotalIndex = gS.totalIndex(testString,"," ,"This is your data input");

        //.totalIndex gets the totalIndex, it will get u the first char of the the search

        System.out.println(TotalIndex);

    }
}
```
# Index Overview:
This is a overview of the two Index substring fetcher

# TotalIndex:
 TotalIndex gets the Total index of the String that you were looking for.

 ```Java
    getSubstring gS = new getSubstring();
    int TotalIndex = gs.totalIndex(inputString,splitChar,searchString)
```
 # ListIndex:
  ListIndex will give you the Index for the Arraylist from .split(). 
```Java
    getSubstring gS = new getSubstring();
    int ListIndex = gS.getListIndex(gS.split(input, splitChar),searchString);
 ```
  # getSubstring:
  With .getSubstring you can check if the searchString is in the ArrayList.
  ```Java
     getSubstring gS = new getSubstring();
     String searchConfirmation = gS.getSubstring(input, searchChar, searchString);
  ```
  
  
  

