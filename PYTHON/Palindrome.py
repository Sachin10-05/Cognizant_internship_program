S = input("Enter the string : ").replace(" ", "")
a = S.lower()

if (a==a[::-1]):
    print("Yes, the string is a palindrome!")
else:
    print("No, the string is not a palindrome!")
