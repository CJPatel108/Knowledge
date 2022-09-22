import java.util.*;

public class whileJava
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request input from user
        int i = 0;
        int num = 0;
        int sum1 = 0;

        while(num!=-1)
        {
            sum1+=num;
            System.out.print("Please enter a number: ");
            num = Integer.parseInt(keyboardInput.nextLine());
            i+=1;
        }
        
        //calculate average
        if (i!=1)
        {
            double average = sum1/(i-1);
            System.out.println(average); 
        }
        else
        {
            System.out.println("Please enter at least one number");
        }

        keyboardInput.close();
    }
}