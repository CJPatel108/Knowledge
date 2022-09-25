#Task16 - logic.py
#------------------------------------------------------------#
#request user input
print "Please enter time taken to finish lap1 in seconds: "
lap1 = gets.chomp() #logical error - needs to be converted to int
print "Please enter time taken to finish lap2 in seconds: "
lap2 = gets.chomp() #logical error - needs to be converted to int
print "Please enter time taken to finish lap3 in seconds: "
lap3 = gets.chomp() #logical error - needs to be converted to int

duration = lap1 + lap2 + lap3 #logical error - adding three string variables

puts "Total time taken to complete race: " + duration #logical error - variable duration's output value is equivalent to a mesh of variables lap1,lap2 and lap3