#Task17 - disappear.rb
#------------------------------------------------------------#
#request input from user
print "Please enter a value for a string variable: "
original = gets.chomp()
print "Which characters would you like to make disappear? "
characters = gets.chomp() #to be entered without commas or spaces
#characters = characters.gsub(",","") ; if characters are seperated by commas
disappear = original

#remove specified characters
for i in Range.new(0,characters.length)
  disappear = disappear.gsub(characters[i],"")
end
      
puts disappear