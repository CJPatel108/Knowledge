import java.util.*;

public class names
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request input from user
        int i = 0;
        String name = "";
        while (!name.equals("stop"))
        {
            System.out.print("Please enter the names of all pupils in class: ");
            name = keyboardInput.nextLine().toLowerCase();
            i+=1;
        }
        
        System.out.println("Number of pupils in class: " + (i-1));

        keyboardInput.close();
    }
}