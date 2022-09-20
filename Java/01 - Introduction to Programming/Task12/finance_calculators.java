import java.util.*;

public class finance_calculators
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        String calculation;
        double deposit;
        double interestRate;
        double years;
        String interest;
        double amount;
        double presentValue;
        double months;
        //request user input
        System.out.println("Choose either 'investment' or 'bond' from the menu below to proceed:");
        System.out.println();
        System.out.println("investment\t - to calculate the amount of interest you'll earn on interest");
        System.out.println("bond\t\t - to calculate the amount you'll have to pay on a home loan");
        System.out.println();
        calculation = keyboardInput.nextLine().toLowerCase();

        //calculation for investment
        if (calculation.equals("investment"))
        {
            //request user for input
            System.out.print("Please enter amount that you wish to deposit: R");
            deposit = Double.parseDouble(keyboardInput.nextLine());
            System.out.print("Please enter the interest rate in %: ");
            interestRate = Double.parseDouble(keyboardInput.nextLine());
            System.out.print("Please enter the amount of years that you plan on investing for: ");
            years = Double.parseDouble(keyboardInput.nextLine());
            System.out.print("Simple/compound interest? ");
            interest = keyboardInput.nextLine().toLowerCase();

            //calculate amount according to simple or compound interest and display
            if (interest.equals("simple"))
            {
                amount = Math.round(deposit*(1+(interestRate/100)*years)*100)/100;
            System.out.print("Amount: R" + amount);
            }
            
            else if (interest.equals("compound"))
            {
                amount = Math.round((deposit*Math.pow(1+(interestRate/100), years))*100)/100;
                System.out.print("Amount: R" + amount);
            }
            else
            {
                System.out.print("Invalid input");
            }
        }

        //calculation for bond
        else if (calculation.equals("bond"))
        {
            //request user for input
            System.out.print("Please enter the present value of the house: R");
            presentValue = Double.parseDouble(keyboardInput.nextLine());
            System.out.print("Please enter the interest rate in %: ");
            interestRate = Double.parseDouble(keyboardInput.nextLine());
            System.out.print("Please enter the amount of months you plan to take to repay the bond: ");
            months = Double.parseDouble(keyboardInput.nextLine());
            //calculate amount and display
            amount = Math.round(presentValue*(((interestRate/100/12)*(Math.pow((1+(interestRate/100/12)),months)/((Math.pow((1+(interestRate/100/12)),months)-1)))))*100)/100;

            System.out.print("Amount to repay per month: R" + amount);
        }
        //display error message for invalid input
        else
        {
            System.out.println("Invalid input. Aborting all calculations");
        }

        keyboardInput.close();
    }
}