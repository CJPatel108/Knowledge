import java.util.*;

public class full_name
{
  public static void main(String[] args)
  {
    Scanner keyboardInput = new Scanner(System.in);
    
    //request input from user
    System.out.print("Please enter your full name: ");
    String full_name = keyboardInput.nextLine();

    //validation check
    if (full_name=="")
    {
        System.out.println("You haven't entered anything. Please enter your full name");
    }
    else if (full_name.length()<4)
    {
        System.out.println("You have entered less than 4 characters. Please make sure that you have entered your name and surname");
    }
    else if (full_name.length()>25)
    {
        System.out.println("You have entered more than 25 characters. Please make sure that you have only entered your full name");
    }
    else
    {
        System.out.println("Thank you for entering your name");
    }

    keyboardInput.close();

  }
}
