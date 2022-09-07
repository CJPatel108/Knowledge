//Task4 - details.java
/************************************************************/
import java.util.*;


public class details
{
    public static void main (String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your Name: ");
        String name = keyboardInput.nextLine();
        System.out.print("Please enter your Age: ");
        String age = keyboardInput.nextLine();
        System.out.print("Please enter your House Number: ");
        String house_number = keyboardInput.nextLine();
        System.out.print("Please enter your Street Name: ");
        String street_name = keyboardInput.nextLine();

        System.out.println("This is "+ name + " he is " + age + " years old and lives at house number " + house_number + " on " + street_name);
        keyboardInput.close();
    }
}