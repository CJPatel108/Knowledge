#Task13 - while.rb
#------------------------------------------------------------#
#request input from user
i = 0
num = 0
sum1 = 0

while num!=-1
	sum1+=num
    print "Please enter a number: "
	num = gets.chomp().to_i
	i+=1
end

#calculate average
if i!=1
	average = sum1/(i-1)
	puts average
else
	puts "Please enter at least one number"
end