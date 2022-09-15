// See https://aka.ms/new-console-template for more information
double price;
double distance;
string question = "";
double deliveryCost;
double insurance;
double gift;
double deliveryType;

//request input from user
Console.Write("Please enter the price of the package that you would like to purchase: ");
price = Convert.ToDouble(Console.ReadLine());
Console.Write("Please enter the total distance of the delivery in kms: ");
distance = Convert.ToDouble(Console.ReadLine());

//determine parcel final cost based on delivery preferences
Console.Write("Air or freight? ");
question = Console.ReadLine().ToLower();
if (question.Equals("air"))
{
    deliveryCost = 0.36 * distance;
}
else
{
    deliveryCost = 0.25 * distance;
}

Console.Write("Full or limited insurance? ");
question = Console.ReadLine().ToLower();
if (question.Equals("full"))
{
    insurance = 50.00;
}
else
{
    insurance = 25.00;
}

Console.Write("Gift or no gift? ");
question = Console.ReadLine().ToLower();
if (question.Equals("gift"))
{
    gift = 15.00;

}
else
{
    gift = 0.00;
}

Console.Write("Priority or standard delivery? ");
question = Console.ReadLine().ToLower();
if (question.Equals("priority"))
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
Console.WriteLine("Total Delivery Cost: R" + totalDeliveryCost);