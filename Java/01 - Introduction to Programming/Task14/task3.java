import java.util.*;

public class task3
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        
        //while loop displaying countdown from 20 to 0
        int i = 20;
        while (i>-1)
        {
            System.out.println(i);
            i=i-1;
        }
        System.out.println();
        
        //loop that will display all even numbers between 1 and 20
        for (int j = 0; j <= 20; j++)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }
        System.out.println();
        
        //loop for pattern
        for (int k = 1; k <= 5; k++)
        {
            for (int l = 0; l < k; l++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        
        //determine the greatest common divisor/highest common factor of 2 positive integers
        //request input from user
        System.out.print("Please enter a positive integer for num1: ");
        int num1 = Integer.parseInt(keyboardInput.nextLine());
        System.out.print("Please enter a positive integer for num2: ");
        int num2 = Integer.parseInt(keyboardInput.nextLine());
        int temp;
        //sort smallest to biggest
        if (num1>num2)
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Smallest: " + num1);
        System.out.println("Biggest: " + num2);
        
        //determine gcd
        int gcd = 0;
        for (int j = 1; j < num1+1; j++)
        {
            if (num1%j==0 && num2%j==0)
            {
                gcd = j;
            }
        }
        System.out.println("GCD: " + gcd);

        keyboardInput.close();
    }
}