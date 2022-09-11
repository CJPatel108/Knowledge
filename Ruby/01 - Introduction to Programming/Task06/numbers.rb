#Task6 - numbers.rb
#------------------------------------------------------------#
#request input from user
print "Please enter an integer for num1: "
num1 = gets.chomp().to_i
print "Please enter an integer for num2: "
num2 = gets.chomp().to_i
print "Please enter an integer for num3: "
num3 = gets.chomp().to_i

#sum of all numbers
puts(num1+num2+num3)

#num1 minus num2
puts(num1-num2)

#num3 multiplied by num1
puts(num3*num1)

#sum of all three numbers divided by num3
puts((num1+num2+num3)/num3)