#Task14 - task2.rb
#------------------------------------------------------------#
#request input from user
print "What year do you want to start with?\t"
startYear = gets.chomp().to_i
print "How many years do you want to check?\t"
years = gets.chomp().to_i
puts

#determine if year is a leap year or not
for i in Range.new(startYear, startYear+years)
	if i%4==0
		puts i.to_s + " is a leap year"
	else
		puts i.to_s + " isn't a leap year"
    end
end