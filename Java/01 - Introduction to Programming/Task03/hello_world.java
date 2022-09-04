import java.util.*;
public class hello_world
{
  public static void main(String[] args)
  {
    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String name = keyboardInput.nextLine();
    System.out.println(name);
    System.out.print("Please enter your age: ");
    String age = keyboardInput.nextLine();
    System.out.println(age);

    System.out.println("Hello World!");
  }
}
