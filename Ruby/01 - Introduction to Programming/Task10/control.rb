#Task10 - control.rb
#------------------------------------------------------------#
#request input from user
print "What is your age? "
age = gets.chomp().to_i

#print message according to age
if age>=18
	print("You are old enough!")
elsif age>16
	print("Almost there")
else
	print("You're just too young!")
end