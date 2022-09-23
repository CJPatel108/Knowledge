#Task14 - task1.rb
#------------------------------------------------------------#
#request input from user
print "Please enter a number: "
num = gets.chomp().to_i

for i in Range.new(1, 12)
	puts num.to_s + " x " + i.to_s + " =  " + (num*(i)).to_s
end