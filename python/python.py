

# # Arithmetic Operators
# x = 10
# y = 5
# print(x + y)  # Addition operator
# print(x - y)  # Subtraction operator
# print(x * y)  # Multiplication operator
# print(x / y)  # Division operator
# print(x % y)  # Modulo operator
# print(x ** y) # Exponentiation operator

# # Comparison Operators
# x = 10
# y = 5
# print(x > y)   # Greater than operator
# print(x >= y)  # Greater than or equal to operator
# print(x < y)   # Less than operator
# print(x <= y)  # Less than or equal to operator
# print(x == y)  # Equal to operator
# print(x != y)  # Not equal to operator

# # Logical Operators
# x = True
# y = False
# print(x and y) # Logical AND operator
# print(x or y)  # Logical OR operator
# print(not x)   # Logical NOT operator

# # Bitwise Operators
# x = 10
# y = 5
# print(x & y)   # Bitwise AND operator
# print(x | y)   # Bitwise OR operator
# print(x ^ y)   # Bitwise XOR operator
# print(~x)      # Bitwise NOT operator
# print(x << 2)  # Bitwise left shift operator
# print(x >> 2)  # Bitwise right shift operator

# # Assignment Operators
# x = 10
# x += 5  # Addition assignment operator
# print(x)
# x -= 5  # Subtraction assignment operator
# print(x)
# x *= 2  # Multiplication assignment operator
# print(x)
# x /= 2  # Division assignment operator
# print(x)
# x %= 3  # Modulo assignment operator
# print(x)
# x **= 2 # Exponentiation assignment operator
# print(x)

# # Membership Operators
# x = [1, 2, 3]
# print(1 in x)  # Check if 1 is in the list
# print(4 not in x)  # Check if 4 is not in the list

# # Identity Operators
# x = 10
# y = 10
# print(x is y)  # Check if x and y refer to the same object
# print(x is not y)  # Check if x and y do not refer to the same object


# # Take user input for two numbers
# num1 = float(input("Enter first number: "))
# num2 = float(input("Enter second number: "))

# # Perform arithmetic operations
# sum = num1 + num2
# diff = num1 - num2
# prod = num1 * num2
# quot = num1 / num2

# # Print results
# print("Sum of", num1, "and", num2, "is", sum)
# print("Difference of", num1, "and", num2, "is", diff)
# print("Product of", num1, "and", num2, "is", prod)
# print("Quotient of", num1, "and", num2, "is", quot)

# x = 5
# if x > 3:
#     print("x is greater than 3")


# x = 5
# if x > 10:
#     print("x is greater than 10")
# elif x > 3:
#     print("x is greater than 3")
# else:
#     print("x is less than or equal to 3")




# x = 5
# y = 10
# if x > 3 and y < 15:
#     print("Both conditions are true")




# x = 5
# y = 10
# if x > 3:
#     if y < 15:
#         print("Both conditions are true")




#For Loop:
#A for loop is used to iterate over a sequence (such as a list or tuple) or other iterable object (such as a string).

#Example:
# fruits = ["apple", "banana", "cherry"]
# for fruit in fruits:
#     print(fruit)


# i = 0
# while i < 5:
#     print(i)
#     i += 1



def fibonacci(n):
    sequence = [0, 1]  # Initialize sequence with first two terms
    for i in range(2, n):
        next_term = sequence[i-1] + sequence[i-2]  # Add the last two terms
        sequence.append(next_term)
    return sequence


print(fibonacci(20))
