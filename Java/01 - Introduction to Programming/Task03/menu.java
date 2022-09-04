import java.util.*;

public class menu
{
  public static void main(String[] args)
  {
    Scanner keyboardInput = new Scanner(System.in);
    System.out.println("Please enter your 3 favourite foods");
    System.out.print("Item 1: ");
    String item1 = keyboardInput.nextLine();
    System.out.print("Item 2: ");
    String item2 = keyboardInput.nextLine();
    System.out.print("Item 3: ");
    String item3 = keyboardInput.nextLine();

    System.out.println("Order confirmation! You have ordered:");
    System.out.println(item1);
    System.out.println(item2);
    System.out.println(item3);
  }
}
