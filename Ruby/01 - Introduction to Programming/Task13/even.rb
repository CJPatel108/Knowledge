#Task13 - even.rb
#------------------------------------------------------------#
#request input from user
print "Please enter a number: "
num = gets.chomp().to_i

#initialising first even number as 2
even=2

#prints out all even numbers from 1 up to and possibly including num
while even<=num
	puts even
	even+=2
end