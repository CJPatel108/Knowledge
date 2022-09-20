#Task12 - finance_calculators.rb
#------------------------------------------------------------#
#request user input
puts "Choose either 'investment' or 'bond' from the menu below to proceed:"
puts
puts "investment\t - to calculate the amount of interest you'll earn on interest"
puts "bond\t\t - to calculate the amount you'll have to pay on a home loan"
puts
calculation = gets.chomp().downcase()

#calculation for investment
if calculation=="investment"
	#request user for input
    print "Please enter amount that you wish to deposit: R"
	deposit = gets.chomp().to_f
    print "Please enter the interest rate in %: "
	interestRate = gets.chomp().to_f
    print "Please enter the amount of years that you plan on investing for: "
	years = gets.chomp().to_f
    print "Simple/compound interest? "
	interest = gets.chomp().downcase()

	#calculate amount according to simple or compound interest and display
	if interest=="simple"
		amount = deposit*(1+(interestRate/100)*years).round(2)
		puts "Amount: R" + amount.to_s
    elsif interest == "compound"
		amount = (deposit*(1+interestRate/100)**years).round(2)
		puts "Amount: R" + amount.to_s
	else
		puts "Invalid input"
    end

#calculation for bond
elsif calculation=="bond"
	#request user for input
    print "Please enter the present value of the house: R"
	presentValue = gets.chomp().to_f
    print "Please enter the interest rate in %: "
	interestRate = gets.chomp().to_f
    print "Please enter the amount of months you plan to take to repay the bond: "
	months = gets.chomp().to_f

	#calculate amount and display
	amount = presentValue*(((interestRate/100/12)*(((1+(interestRate/100/12))**months)/((((1+(interestRate/100/12))**months)-1))))).round(2)

	puts "Amount to repay per month: R" + amount.to_s

#display error message for invalid input
else
	puts "Invalid input. Aborting all calculations"
end