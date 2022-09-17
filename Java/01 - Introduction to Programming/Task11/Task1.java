//import java.util.*;

public class Task1
{
    public static void main(String[] args)
    {
        //initialising number value to three variables
        int num1 = 13;
        int num2 = 30;
        int num3 = 24;
        int temp;

        //compare num1 and num2 and print the larger value
        if (num1>num2)
        {
            System.out.println("Larger value is num1: " + num1);
        }
        else
        {
            System.out.println("Larger value is num2: " + num2);
        }
        
        //determine if num1 is odd or even and System.out.print result
        if (num1%2 == 0)
        {
            System.out.println(num1 + " is an even number");
        }
        else
        {
            System.out.println(num1 + " is an odd number");
        }

        //sort from largest to smallest
        if (num1<num2)
        {
            temp = num1;
            num1= num2;
            num2 = temp;
        }
         
        if (num2<num3)
        {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        //display largest to smallest
        System.out.println("Largest to smallest:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
    }
}