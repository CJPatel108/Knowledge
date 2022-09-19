import java.util.*;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        int num;
        //request input from user
        System.out.print("Please enter an integer: ");
        num = Integer.parseInt(keyboardInput.nextLine());

        //determine if num is divisible by 2 and 5, by 2 or 5, or by neither
        if (num%2==0 && num%5==0)
        {
            System.out.println(num + " is divisible by 2 and 5");
        }
        else if (num%2==0 || num%5==0)
        {
            System.out.println(num + " is divisible by 2 or 5");
        }
        else
        {
            System.out.println(num + " is not divisible by 2 or 5");
        }
        
        keyboardInput.close();
    }
}