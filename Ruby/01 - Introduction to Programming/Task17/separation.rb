#Task17 - separation.rb
#------------------------------------------------------------#
#request input from user
print "Please enter a value for a string variable: "
original = gets.chomp()

#replace all space characters with newline
separation = original.gsub(" ", "\n")

#display result
print(separation)