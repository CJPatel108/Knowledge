#Task6 - shopping.rb
#------------------------------------------------------------#
#request input from user
print "Please enter the name of product1: "
product1 = gets.chomp()
print "Please enter the name of product2: "
product2 = gets.chomp()
print "Please enter the name of product3: "
product3 = gets.chomp()

#request input from user
#cast and round-off appropriately
print "Please enter the price of product1: "
price1 = gets.chomp().to_f
price1 = price1.round(2)
print "Please enter the price of product2: "
price2 = gets.chomp().to_f
price2 = price2.round(2)
print "Please enter the price of product3: "
price3 = gets.chomp().to_f
price3 = price3.round(2)

#calculations for total and average price of three products
total = price1+price2+price3
total = total.round(2)
ave_price = total/3
ave_price = ave_price.round(2)

#print appropriate message with total and average price
print("The Total of " + product1 + ", " + product2 + ", " + product3 + " is R" + total.to_s + " and the average price of the items are R" + ave_price.to_s + ".")