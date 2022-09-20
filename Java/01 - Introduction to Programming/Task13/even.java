import java.util.*;

public class even
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request input from user
        System.out.print("Please enter a number: ");
        int num = Integer.parseInt(keyboardInput.nextLine());

        //initialising first even number as 2
        int even = 2;

        //prints out all even numbers from 1 up to and possibly including num
        while (even<=num)
        {
            System.out.println(even);
            even+=2;
        }

        keyboardInput.close();        
    }
}