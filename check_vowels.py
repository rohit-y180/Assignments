vowels = {"a", "e", "i", "o", "u"}
test_string="this is a test string"
vowel_flag=0
for i in test_string:
    for j in vowels:
        if(i==j):
            vowel_flag=1

if(vowel_flag==1):
    print("string contains vowels")
else:
    print("string does not contain vowels")