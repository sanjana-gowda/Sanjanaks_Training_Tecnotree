
# name = input("Enter your name: ")
# age = int(input("Enter your age: "))


# age_after_10_years = age + 10

# print("Hi", name + "!", "In 10 years, you will be", age_after_10_years, "years old.")


# 



# Opening a file
file = open('a1.txt', 'r')

# Reading from a file
content = file.read()
print(content)

# Closing a file
file.close()

# Writing to a file
with open('a1.txt', 'a') as file:
    file.write('\nhello sanjana')

# Reading from a file again
with open('a1.txt', 'r') as file:
    content = file.read()
    print(content)
