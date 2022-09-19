import java.util.*;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        double swimming;
        double cycling;
        double running;
        double total_time;
        
        //request input from user
        System.out.print("Please enter time taken to complete swimming: ");
        swimming = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter time taken to complete cycling: ");
        cycling = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter time taken to complete running: ");
        running = Double.parseDouble(keyboardInput.nextLine());
        
        //calculate and diplay of total time taken
        total_time = swimming + cycling + running;
        System.out.println("Total Time Taken: " + total_time);
        
        //determine and display award
        if (total_time<=100)
        {
            System.out.println("Award: Provincial Colours");
        }
        else if (total_time<=105)
        {
            System.out.println("Award: Provincial Half Colours");
        }
        else if (total_time<=110)
        {
            System.out.println("Award: Provincial Scroll");
        }
        else
        {
            System.out.println("Award: No award");
        }

        keyboardInput.close();
    }
}