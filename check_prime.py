
num=int(input("please enter a number to check if it's prime or not\n"))

try:
    prime_flag=1
    if (num <= 1):
        prime_flag=0
    if (num==2):
        prime_flag=1
    for i in range(3,int(num/2)+1):
        if (num % i == 0):
            prime_flag=0
            break
        else:
            prime_flag=1
            
except Exception as e:
    print("error occured, try again ! \n"+e)
if(prime_flag==1):
    print("number is prime")
else:
    print("number is not prime")