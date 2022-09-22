#Task13 - names.rb
#------------------------------------------------------------#
#request input from user
i = 0
name = ""
while name!="stop"
    print "Please enter the names of all pupils in class: "
	name = gets.chomp().downcase()
	i+=1
end

puts "Number of pupils in class: " + (i-1).to_s