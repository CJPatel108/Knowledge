#Task11 - task3.rb
#------------------------------------------------------------#
#request input from user
print "Please enter time taken to complete swimming: "
swimming = gets.chomp().to_f
print "Please enter time taken to complete cycling: "
cycling = gets.chomp().to_f
print "Please enter time taken to complete running: "
running = gets.chomp().to_f

#calculate and diplay of total time taken
total_time = swimming + cycling + running
puts "Total Time Taken: " + total_time.to_s

#determine and display award
if total_time<=100
	puts "Award: Provincial Colours"
elsif total_time<=105
	puts "Award: Provincial Half Colours"
elsif total_time<=110
	puts "Award: Provincial Scroll"
else
	puts "Award: No award"
end
