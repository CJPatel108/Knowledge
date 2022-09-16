import java.util.*;

public class control
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        
        //request input from user
        System.out.print("What is your age? ");
        int age = Integer.parseInt(keyboardInput.nextLine());

        //print message according to age
        if (age>=18)
        {
            System.out.print("You are old enough!");
        }
        else if (age>16)
        {
            System.out.print("Almost there");
        }
        else 
        {
            System.out.print("You're just too young!");
        }

        keyboardInput.close();
    }
}