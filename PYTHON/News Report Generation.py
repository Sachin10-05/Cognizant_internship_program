print("Dead Count:")
dcount = int(input())

if (dcount<0):
    print("Invalid Input")
else:
    print("Injured Count:")
    icount = int(input())
    
    if (icount<0):
        print("Invalid Input")
    else:
        print("Safe Count:")
        scount = int(input())
        
        if (scount <0):
            print("Invalid Input")
        else:
            print("TSUNAMI REPORT OF JAPAN")
            print("The number of people")
            print("Dead:{0}".format(dcount))
            print("Injured:{0}".format(icount))
            print("Safe:{0}".format(scount))
            print()
            print("Please help the people who are suffering!!!")
    
