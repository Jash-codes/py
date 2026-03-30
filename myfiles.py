file = open("samplefile.txt" , "w")
file.write("hello.\n")
file.write("second line.\n")
file.close()

file = open("samplefile.txt" , "r")
content = file.read()
print(content)

file = open("sample.txt", "a")
file.write("This line is added later.\n")
file.close()

file = open("sample.txt", "r")
print("Updated file content:")
print(file.read())
file.close()

