#Task9 - courier.rb
#------------------------------------------------------------#
#request input from user
print "Please enter the price of the package that you would like to purchase: "
price = gets.chomp().to_f
print "Please enter the total distance of the delivery in kms: "
distance = gets.chomp().to_f

#determine parcel final cost based on delivery preferences
print "Air or freight? "
question = gets.chomp().downcase()
if question == "air"
	deliveryCost = 0.36 * distance
else
	deliveryCost = 0.25 * distance
end

print "Full or limited insurance? "
question = gets.chomp().downcase()
if question == "full"
	insurance = 50.00
else
	insurance = 25.00
end

print "Gift or no gift? "
question = gets.chomp().downcase()
if question == "gift"
	gift = 15.00
else
	gift = 0.00
end

print "Priority or standard delivery? "
question = gets.chomp().downcase()
if question == "priority"
	deliveryType = 100.00
else
	deliveryType = 20.00
end

#Calculate total cost
totalDeliveryCost = price+deliveryCost+insurance+gift+deliveryType
totalDeliveryCost = totalDeliveryCost.round(2)

#print total delivery cost
print "Total Delivery Cost: R" + totalDeliveryCost.to_s