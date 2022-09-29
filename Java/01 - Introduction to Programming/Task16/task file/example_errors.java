// import java.util.*;

public class example_errors
{
    public static void main(String[] args)
    {
        // This example program is meant to demonstrate errors.

        // There are some errors in this program, try run the program by pressing F5.
        // Now look at the error messages and find and fix the errors.

        //initialise variables
        String name = "Tim";
        String surname = " Jones"; //syntax error - incorrect space indentation; //possible logical error - extra spacing in beginning of string
        int age = 21;

        String fullMessage = name + surname + " is " + age + " years old"; //Runtime error - variable age needs to be converted to string; //syntax error - 'is' is under the wrong syntax, needs to be within quotations; //possible logical error - missing appropriate spacing between name and surname;

        System.out.println(fullMessage); //syntax error - missing parenthesis;

    }
}