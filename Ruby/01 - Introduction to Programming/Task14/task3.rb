#Task14 - task3.rb
#------------------------------------------------------------#
#while loop displaying countdown from 20 to 0
i=20
while i>-1
	puts i
	i=i-1
end
puts

#loop that will display all even numbers between 1 and 20
for j in Range.new(1,20)
	if(j%2==0)
		puts j
    end
end
puts

#loop for pattern
for k in Range.new(0,4)
	for l in Range.new(0,k)
		print '*'
    end
	puts
end
puts

#determine the greatest common divisor/highest common factor of 2 positive integers
#request input from user
print "Please enter a positive integer for num1: "
num1 = gets.chomp().to_i
print "Please enter a positive integer for num2: "
num2 = gets.chomp().to_i

#sort smallest to biggest
if num1>num2
	temp = num1
	num1 = num2
	num2 = temp
end
puts "Smallest: " + num1.to_s
puts "Biggest: " + num2.to_s

#determine gcd
for m in Range.new(1,num1+1)
	if num1%m==0 && num2%m==0
		gcd=m
    end
end
puts "GCD: " + gcd.to_s