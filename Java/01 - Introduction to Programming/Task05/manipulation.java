import java.util.Scanner;

//Task5 - manipulation.java
/************************************************************/
//import java.util.*;

public class manipulation
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request input from user
        System.out.print("Please enter a sentence: ");
        String str_manip = keyboardInput.nextLine();

        //determine and display length of variable str_manip
        int length = str_manip.length();
        System.out.println(length);
        
        //determine last character of variable str_manip and replace all occurences of the character in the variable str_manip
        char last = str_manip.charAt(length-1);
        System.out.println(str_manip.replace(last,'@'));

        //determine and print the last 3 characters of the variable str_manip backwards
        String last3 = str_manip.substring(length-3, length);
        for (int i = last3.length()-1; i >= 0; i--)
        {
            System.out.print(last3.charAt(i));
        }
        System.out.println();
        
        //create and print a 5-letter word consisting of the first 3 the characters and the last 2 characters of the variable str_manip
        String newWord =str_manip.substring(0,3) + str_manip.substring(length-2, length);
        System.out.println(newWord);

        //display each word in the variable str_manip on a new line
        System.out.println(str_manip.replace(" ", "\n"));

        keyboardInput.close();         

    }
}
