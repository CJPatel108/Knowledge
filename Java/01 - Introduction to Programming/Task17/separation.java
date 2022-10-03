import java.util.*;

public class separation
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request input from user
        System.out.println("Please enter a value for a string variable: ");
        String original = keyboardInput.nextLine();

        //replace all space characters with newline
        String separation = original.replace(" ", "\n");

        //display result
        System.out.println(separation);
    }
}