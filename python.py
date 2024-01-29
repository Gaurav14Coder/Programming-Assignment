#Program to check if the given number is Prime

num = 200
if num > 1:
    for i in range(2, int(num/2)+1):
        if (num % i) == 0:
            print( "Not a prime number")
            break
    else:
        print(" Prime number")
else:
    print( "Not a prime number")


#Program to check if a vowel is present in the string

String = "BrowserStack"
count = 0

String = String.lower()
for i in String:
    if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
        count+=1

if count == 0:
    print('No vowels found')
else:
    print('Total vowels are :' + str(count))

