import java.util.*;
public class shopping
{
  public static void main(String[] args)
  {
    Scanner keyboardInput = new Scanner(System.in);
    //request input from user
    System.out.print("Please enter the name of product1: ");
    String product1 = keyboardInput.nextLine();
    System.out.print("Please enter the name of product2: ");
    String product2 = keyboardInput.nextLine();
    System.out.print("Please enter the name of product3: ");
    String product3 = keyboardInput.nextLine();

    //request input from user
    //cast and round-off appropriately
    System.out.print("Please enter the price of product1: ");
    double price1 = Double.parseDouble(keyboardInput.nextLine());
    price1 = Math.round(price1*100)/100;
    System.out.print("Please enter the price of product2: ");
    double price2 = Double.parseDouble(keyboardInput.nextLine());
    price2 = Math.round(price2*100)/100;
    System.out.print("Please enter the price of product3: ");
    double price3 = Double.parseDouble(keyboardInput.nextLine());
    price3 = Math.round(price3*100)/100;

    //calculations for total and average price of three products
    double total = price1+price2+price3;
    total = Math.round(total*100)/100;
    double ave_price = total/3;
    ave_price = Math.round(ave_price*100)/100;

    //print appropriate message with total and average price
    System.out.println("The Total of " + product1 + ", " + product2 + ", " + product3 + " is R" + total + " and the average price of the items are R" + ave_price + ".");


    keyboardInput.close();

  }
}
