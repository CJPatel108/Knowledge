// See https://aka.ms/new-console-template for more information
//request input from user
Console.Write("Please enter the name of product1: ");
string product1 = Console.ReadLine();
Console.Write("Please enter the name of product2: ");
string product2 = Console.ReadLine();
Console.Write("Please enter the name of product3: ");
string product3 = Console.ReadLine();


//request input from user
//cast and round-off appropriately
Console.Write("Please enter the price of product1: ");
double price1 = Convert.ToDouble(Console.ReadLine());
price1 = Math.Round(price1,2);
Console.Write("Please enter the price of product2: ");
double price2 = Convert.ToDouble(Console.ReadLine());
price2 = Math.Round(price2,2);
Console.Write("Please enter the price of product3: ");
double price3 = Convert.ToDouble(Console.ReadLine());
price3 = Math.Round(price3,2);

//calculations for total and average price of three products
double total = price1+price2+price3;
total = Math.Round(total,2);
double ave_price = total/3;
ave_price = Math.Round(ave_price,2);

//print appropriate message with total and average price
Console.WriteLine("The Total of " + product1 + ", " + product2 + ", " + product3 + " is R" + total + " and the average price of the items are R" + ave_price + ".");

