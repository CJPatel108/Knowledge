#Task7 - full_name.rb
#------------------------------------------------------------#
#request input from user
print "Please enter your full name: "
full_name = gets.chomp()

#validation check
if full_name==""
	puts "You haven't entered anything. Please enter your full name"
elsif full_name.length<4
	puts "You have entered less than 4 characters. Please make sure that you have entered your name and surname"
elsif full_name.length>25
	puts "You have entered more than 25 characters. Please make sure that you have only entered your full name"
else
	puts "Thank you for entering your name"
end