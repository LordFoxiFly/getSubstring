# getSubstring
This is a Java repo that can fetch your data. Input your data and get u the index of a substring or check if the substring 
consist. 

# Basic Usage
```Java

public class Main{

    public static void main(String[] args) throws IOException {
        String testString = "This is ur data input, here u can put ur data in";

        getSubstring gS = new getSubstring();

        String searchConfirmation = gS.getSubstring(testString, ",", "This is ur data input");

        //.getSubstring will comfirm u that the String is in the data input

        System.out.println(searchConfirmation);

        Integer ListIndex = gS.getListIndex(gS.split(testString, ","),"This is ur data input");

        //.getIndex will get u the ListIndex(Index of the Arraylist) of the data
        //.split will split the String into a Arraylist

        System.out.println(ListIndex);

    }
}
```
# Coming Soon
  Total Index
  

