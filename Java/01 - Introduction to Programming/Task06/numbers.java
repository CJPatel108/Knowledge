import java.util.*;
public class numbers
{
  public static void main(String[] args)
  {
    Scanner keyboardInput = new Scanner(System.in);

    //request input from user
    System.out.print("Please enter an integer for num1: ");
    int num1 = Integer.parseInt(keyboardInput.nextLine());
    System.out.print("Please enter an integer for num2: ");
    int num2 = Integer.parseInt(keyboardInput.nextLine());
    System.out.print("Please enter an integer for num3: ");
    int num3 = Integer.parseInt(keyboardInput.nextLine());
       
    //sum of all numbers
    System.out.println(num1+num2+num3);

    //num1 minus num2
    System.out.println(num1-num2);

    //num3 multiplied by num1
    System.out.println(num3*num1);

    //sum of all three numbers divided by num3
    System.out.println((num1+num2+num3)/num3);

    keyboardInput.close();

  }
}
