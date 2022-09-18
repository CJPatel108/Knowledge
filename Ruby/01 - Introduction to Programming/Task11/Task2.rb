#Task11 - task2.rb
#------------------------------------------------------------#
#initialise variable to equal pi
pi = Math::PI
#request input from user
print "Please enter the shape of the building. Square, rectangular or round? "
shape = gets.chomp().downcase()

#request dimensions of square and calculate area
if shape == "square"
    print "Please enter length: "
	length = gets.chomp().to_f
	area = length**2
	puts "Area: " + area.to_s
end

#request dimensions of rectangular shape and calculate area
if shape == "rectangular"
    print "Please enter length: "
	length = gets.chomp().to_f
    print "Please enter width: "
	width = gets.chomp().to_f
	area = length*width
	puts "Area: " + area.to_s
end

#request dimensions of round shape and calculate area
if shape == "round"
    print "Please enter radius: "
	radius = gets.chomp().to_f
	area = pi*(radius**2)
	puts "Area: " + area.to_s
end