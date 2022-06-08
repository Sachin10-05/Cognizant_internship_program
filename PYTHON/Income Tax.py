print("Enter the age:")
Age = int(input())

if (Age<18 or Age>100):
    print("Invalid Age")
    
elif (Age>=18 and Age<=60):
    print("Enter the income:")
    income = int(input())
    
    if (income<0):
        print("Invalid Income")
        
    elif (income>=0 and income<=250000):
        tax = 0
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
        
    elif (income>250000 and income<=500000):
        tax = 10*(income)/100
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
        
    elif (income>500000 and income<=1000000):
        tax = 20*(income)/100
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
    
    elif (income > 1000000):
        tax = 30*(income)/100
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
        
    

elif (Age>60 and Age<=80):
    print("Enter the income:")
    income = int(input())
    
    if (income<0):
        print("Invalid Income")
        
    elif (income<=300000):
        tax = 0
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
        
    elif (income>300000 and income <= 500000):
        tax = 10*(income)/100
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
    
    elif (income>500000 and income<=1000000):
        tax = 20*(income)/100
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
    
    elif (income>1000000):
        tax = 30*(income)/100 
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
        
    

elif (Age>80 and Age<=100):
    print("Enter the income:")
    income = int(input())
    
    if (income<0):
        print("Invalid Income")
        
    if (income<=500000):
        tax = 0
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
        
    elif (income >500000 and income<=1000000):
        tax = 20*(income)/100
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
    
    elif (Age<=100 and income>1000000):
        tax = 30*(income)/100
        k = format(tax,'.2f')
        print("The Tax Amount is: {0}".format(k))
        
        
