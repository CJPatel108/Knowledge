import java.util.*;

public class task2
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request input from user
        System.out.print("What year do you want to start with?\t");
        int startYear = Integer.parseInt(keyboardInput.nextLine());
        System.out.print("How many years do you want to check?\t");
        int years = Integer.parseInt(keyboardInput.nextLine());
        System.out.println();

        int[] range = new int[years];
        for (int i = 0; i < years; i++)
        {
            range[i]= startYear+i;
        }

        //determine if year is a leap year or not
        for (int i : range)
        {
            if (i%4==0)
            {
                System.out.println(i + " is a leap year");
            }
            else
            {
                System.out.println(i + " isn't a leap year");
            }
        }
        keyboardInput.close();
    }
}