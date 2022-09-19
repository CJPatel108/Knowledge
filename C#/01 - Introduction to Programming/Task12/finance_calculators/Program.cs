// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");
string calculation;
double deposit;
double interestRate;
double years;
string interest;
double amount;
double presentValue;
double months;
//request user input
Console.WriteLine("Choose either 'investment' or 'bond' from the menu below to proceed:");
Console.WriteLine();
Console.WriteLine("investment\t - to calculate the amount of interest you'll earn on interest");
Console.WriteLine("bond\t\t - to calculate the amount you'll have to pay on a home loan");
Console.WriteLine();
calculation = Console.ReadLine().ToLower();

//calculation for investment
if (calculation.Equals("investment"))
{
    //request user for input
    Console.Write("Please enter amount that you wish to deposit: R");
    deposit = Convert.ToDouble(Console.ReadLine());
    Console.Write("Please enter the interest rate in %: ");
    interestRate = Convert.ToDouble(Console.ReadLine());
    Console.Write("Please enter the amount of years that you plan on investing for: ");
    years = Convert.ToDouble(Console.ReadLine());
    Console.Write("Simple/compound interest? ");
    interest = Console.ReadLine().ToLower();

    //calculate amount according to simple or compound interest and display
    if (interest.Equals("simple"))
    {
        amount = Math.Round(deposit*(1+(interestRate/100)*years),2);
        Console.Write("Amount: R" + amount);
    }
    
    else if (interest.Equals("compound"))
    {
        amount = Math.Round((deposit*Math.Pow(1+(interestRate/100), years)),2);
        Console.Write("Amount: R" + amount);
    }
    else
    {
        Console.Write("Invalid input");
    }
}

//calculation for bond
else if (calculation.Equals("bond"))
{
    //request user for input
    Console.Write("Please enter the present value of the house: R");
    presentValue = Convert.ToDouble(Console.ReadLine());
    Console.Write("Please enter the interest rate in %: ");
    interestRate = Convert.ToDouble(Console.ReadLine());
    Console.Write("Please enter the amount of months you plan to take to repay the bond: ");
    months = Convert.ToDouble(Console.ReadLine());
    //calculate amount and display
    amount = Math.Round(presentValue*(((interestRate/100/12)*(Math.Pow((1+(interestRate/100/12)),months)/((Math.Pow((1+(interestRate/100/12)),months)-1))))),2);

    Console.Write("Amount to repay per month: R" + amount);
}
//display error message for invalid input
else
{
    Console.WriteLine("Invalid input. Aborting all calculations");
}