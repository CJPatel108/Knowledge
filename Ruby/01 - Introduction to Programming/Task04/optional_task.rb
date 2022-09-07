#Task4 - optional_task.py
#------------------------------------------------------------#
#request input from user
print("Please input a number for num1: ")
num1 = gets.chomp()
print("Please input a second number for num2: ")
num2 = gets.chomp()

#print out variables before swapped values
puts "Before swap:"
puts("num1: " + num1)
puts("num2: " + num2)

#swap variable values by use of temp variable
temp = num1
num1 = num2
num2 = temp

#print out variables with swapped values
puts "After swap:"
puts("num1: " + num1)
puts("num2: " + num2)
