#Task5 - manipulation.rb
#------------------------------------------------------------#
#request input from user
print "Please enter a sentence: "
str_manip = gets.chomp()

#determine and display length of variable str_manip
length = str_manip.length
puts(length)

#determine last character of variable str_manip and replace all occurences of the character in the variable str_manip
#output result
last = str_manip[length-1]
puts(str_manip.gsub(last, "@"))

#determine and print the last 3 characters of the variable str_manip backwards
last3 = str_manip[length-3] + str_manip[length-2] + str_manip[length-1]
puts(last3.reverse)

#create and print a 5-letter word consisting of the first 3 the characters and the last 2 characters of the variable str_manip
newWord = str_manip[0] + str_manip[1] + str_manip[2] + str_manip[length-2] + str_manip[length-1]
puts(newWord)

#display each word in the variable str_manip on a new line
puts(str_manip.gsub(" ", "\n"))