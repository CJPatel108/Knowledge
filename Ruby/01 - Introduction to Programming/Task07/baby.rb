#Task7 - baby.rb
#------------------------------------------------------------#
#request input from user
print "Please enter the year that you were born in: "
DOY = gets.chomp().to_i

#calculation of age and display appropriate message
if 2020-DOY >= 18
	puts("Congrats you are old enough")
#else
#	puts("You are too young")
end