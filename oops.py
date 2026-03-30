class student:

    # __init__ is constructor
    def __init__(self, name, age): #self is a default parameter
        self.name = name
        self.age = age

    def display(self): #method to display
        print("my name is : " , self.name)
        print("age is : " , self.age )

s1 = student("jash",24)
s1.display()

s2 = student("ram", 22)
s2.display()

