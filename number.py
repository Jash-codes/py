n = 10

while True:
    guess = int(input("Enter the no : "))

    if (guess == n):
        print("correct")
    elif (guess < n):
        print("guess higher")
    elif(guess > n):
        print("guess lower")
    else:
        print("incorrect")