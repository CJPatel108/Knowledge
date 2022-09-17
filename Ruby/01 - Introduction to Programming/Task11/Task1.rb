#Task11 - task1.rb
#------------------------------------------------------------#
#initialising number value to three variables
num1 = 13
num2 = 30
num3 = 24

#compare num1 and num2 and print the larger value
if num1>num2
	puts "Larger value is num1: " + num1.to_s
else
	puts "Larger value is num2: " + num2.to_s
end

#determine if num1 is odd or even and print result
if num1%2 == 0
    puts num1.to_s + " is an even number"
else
	puts num1.to_s + " is an odd number"
end

#sort from largest to smallest
if num1<num2
	temp = num1
	num1= num2
	num2 = temp
if num2<num3
	temp = num2
	num2 = num3
	num3 = temp
end

#display largest to smallest
puts "Largest to smallest:"
puts "num1: " + num1.to_s
puts "num2: " + num2.to_s
puts "num3: " + num3.to_s
end