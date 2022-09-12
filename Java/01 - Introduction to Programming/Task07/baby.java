import java.util.*;
public class baby
{
  public static void main(String[] args)
  {
    Scanner keyboardInput = new Scanner(System.in);
    //request input from user
    System.out.print("Please enter the year that you were born in: ");
    int DOY = Integer.parseInt(keyboardInput.nextLine());

    //calculation of age and display appropriate message
    if (2020-DOY >= 18)
    {
        System.out.println("Congrats you are old enough");
    }
	// else
    // {
    //     System.out.println("You are too young");
    // }
    keyboardInput.close();
  }
}
