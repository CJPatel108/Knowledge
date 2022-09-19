#Task11 - task4.rb
#------------------------------------------------------------#
#request input from user
print "Please enter an integer: "
num = gets.chomp().to_i

#determine if num is divisible by 2 and 5, by 2 or 5, or by neither
if num%2==0 and num%5==0
	puts num.to_s + " is divisible by 2 and 5"
elsif num%2==0 or num%5==0
	puts num.to_s + " is divisible by 2 or 5"
else
	puts num.to_s + " is not divisible by 2 or 5"
end
