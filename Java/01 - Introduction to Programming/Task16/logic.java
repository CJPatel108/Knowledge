import java.util.Scanner;

// import java.util.*;

public class logic
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request user input
        System.out.println("Please enter time taken to finish lap1 in seconds: ");
        String lap1 = keyboardInput.nextLine(); //logical error - needs to be converted to int
        System.out.println("Please enter time taken to finish lap2 in seconds: ");
        String lap2 = keyboardInput.nextLine(); //logical error - needs to be converted to int
        System.out.println("Please enter time taken to finish lap3 in seconds: ");
        String lap3 = keyboardInput.nextLine(); //logical error - needs to be converted to int

        String duration = lap1 + lap2 + lap3; //logical error - adding three string variables

        System.out.println("Total time taken to complete race: " + duration); //logical error - variable duration's output value is equivalent to a mesh of variables lap1,lap2 and lap3
        keyboardInput.close();
    }
}