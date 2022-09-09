#Task5 - replace.rb
#------------------------------------------------------------#
#declare string
single_string = "The!quick!brown!fox!jumps!over!the!lazy!dog!"
#replace exclamation mark characters with space character and print
puts single_string.gsub("!"," ")
#further convert string to uppercase and print
puts single_string.gsub("!"," ").upcase()
#further print the sentence into reverse
puts single_string.gsub("!"," ").upcase().reverse

#reverse original string variable
puts single_string.reverse
