import java.util.*;

public class task1
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        
        //request input from user
        System.out.print("Please enter a number: ");
        int num = Integer.parseInt(keyboardInput.nextLine());
        int[] range = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int i : range)
        {
            System.out.println(num + " x " + i + " =  " + num*i);
        }

        keyboardInput.close();
    }
}