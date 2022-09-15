import java.util.*;

public class courier
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        double price;
        double distance;
        String question = "";
        double deliveryCost;
        double insurance;
        double gift;
        double deliveryType;
     
        //request input from user
        System.out.print("Please enter the price of the package that you would like to purchase: ");
        price = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter the total distance of the delivery in kms: ");
        distance = Double.parseDouble(keyboardInput.nextLine());
        
        //determine parcel final cost based on delivery preferences
        System.out.print("Air or freight? ");
        question = keyboardInput.nextLine().toLowerCase();
        if (question.equals("air"))
        {
            deliveryCost = 0.36 * distance;
        }
        else
        {
            deliveryCost = 0.25 * distance;
        }
        
        System.out.print("Full or limited insurance? ");
        question = keyboardInput.nextLine().toLowerCase();
        if (question.equals("full"))
        {
            insurance = 50.00;
        }
        else
        {
            insurance = 25.00;
        }
        
        System.out.print("Gift or no gift? ");
        question = keyboardInput.nextLine().toLowerCase();
        if (question.equals("gift"))
        {
            gift = 15.00;

        }
        else
        {
            gift = 0.00;
        }
        
        System.out.print("Priority or standard delivery? ");
        question = keyboardInput.nextLine().toLowerCase();
        if (question.equals("priority"))
        {
            deliveryType = 100.00;
        }
        else
        {
            deliveryType = 20.00;
        }
        
        //Calculate total cost
        double totalDeliveryCost = price+deliveryCost+insurance+gift+deliveryType;
        
        //print total delivery cost
        System.out.println("Total Delivery Cost: R" + totalDeliveryCost);

        keyboardInput.close();
    }
}