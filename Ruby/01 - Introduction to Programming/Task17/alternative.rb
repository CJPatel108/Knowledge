#Task17 - alternative.rb
#------------------------------------------------------------#
#request input from user
print "Please enter a value for a string variable: "
original = gets.chomp()
#alt = ""

# make each alternate character an uppercase character and each other alternate character a lowercase character.
for i in Range.new(0, original.length)
	if i%2==0
		alt = alt + original[i].upcase #********************************************
	else
		alt = alt + original[i].downcase #******************************************
    end
end

#display result
puts alt