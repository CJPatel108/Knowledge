//Task5 - replace.java
/************************************************************/
//import java.util.*;

public class replace
{
    public static void main(String[] args)
    {
        //declare string
        String single_string = "The!quick!brown!fox!jumps!over!the!lazy!dog!";
        //replace exclamation mark characters with space character and print
        System.out.println(single_string.replace("!"," "));
        //further convert string to uppercase and print
        System.out.println(single_string.replace("!"," ").toUpperCase());
        //further print the sentence into reverse
        String reverseSingleString = single_string.replace("!"," ").toUpperCase();
        for (int i = reverseSingleString.length()-1; i >= 0; i--)
        {
            System.out.print(reverseSingleString.charAt(i));
        }
        System.out.println();
        //reverse original string variable
        for (int i = single_string.length()-1; i >= 0; i--)
        {
            System.out.print(single_string.charAt(i));
        }

    }
}
