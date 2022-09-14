#Task8 - password.rb
#------------------------------------------------------------#
#initialise boolean variables as False
have_length = false
up_case = false
low_case = false
have_num = false

#variable for characteristics met
count = 0

#series of yes/no questions for each variable
print "Is your password at least 6 characters long? yes/no: "
question = gets.chomp().downcase()
if question == "yes"
	have_length = true
	count= count+1
end

print "Does your password contain an Upper Cased letter? yes/no: "
question = gets.chomp().downcase()
if question == "yes"
	up_case = true
	count= count+1
end

print "Does your password contain an Lower Cased letter? yes/no: "
question = gets.chomp().downcase()
if question == "yes"
	low_case = true
	count= count+1
end	

print "Does your password contain numbers? yes/no: "
question = gets.chomp().downcase()
if question == "yes"
	have_num = true
	count= count+1
end

# #display message based off characteristics met
if count>=3
	puts "Your password is suitable"
else
 puts "Your password is not suitable"
end