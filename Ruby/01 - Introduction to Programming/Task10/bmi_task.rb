#Task10 - bmi_task.rb
#------------------------------------------------------------#
#request input from user
print "Please enter your weight in kg: "
weight = gets.chomp().to_f
print "Please enter your height in m: "
height = gets.chomp().to_f

#calculate bmi
bmi = weight/(height**2)

#display bmi and category associated
if bmi >=30
	print "BMI: " + bmi.to_s + " - user is obese"
elsif bmi >=25
	print "BMI: " + bmi.to_s + " - user is overweight"
elsif bmi >=18.5
	print "BMI: " + bmi.to_s + " - user is normal"
elsif bmi <18.5
	print "BMI: " + bmi.to_s + " - user is underweight"
end