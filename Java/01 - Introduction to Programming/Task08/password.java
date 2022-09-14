import java.util.*;
public class password
{
  public static void main(String[] args)
  {
    Scanner keyboardInput = new Scanner(System.in);
    
    //initialise boolean variables as False
    Boolean have_length = false;
    Boolean up_case = false;
    Boolean low_case = false;
    Boolean have_num = false;

    //variable for characteristics met
    int count = 0;
    String question = "";

    //series of yes/no questions for each variable
    System.out.print("Is your password at least 6 characters long? yes/no: ");
    question = keyboardInput.nextLine().toLowerCase();
    if (question.equals("yes"))
    {
      have_length = true;
      count= count+1;
    }

    System.out.print("Does your password contain an Upper Cased letter? yes/no: ");
    question = keyboardInput.nextLine().toLowerCase();
    if (question.equals("yes"))
    {
      up_case = true;
      count= count+1;
    }

    System.out.print("Does your password contain an Lower Cased letter? yes/no: ");
    question = keyboardInput.nextLine().toLowerCase();
    if (question.equals("yes"))
    {
      low_case = true;
      count= count+1;
    }

    System.out.print("Does your password contain numbers? yes/no: ");
    question = keyboardInput.nextLine().toLowerCase();
    if (question.equals("yes"))
    {
      have_num = true;
      count= count+1;
    }

    //display message based off characteristics met
    if (count>=3)
    {
      System.out.println("Your password is suitable");
    }
    else
    {
      System.out.println("Your password is not suitable");
    }
    
    keyboardInput.close();
  }
}
