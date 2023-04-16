
# create a new list of squares of numbers from 1 to 10
squares = [i**2 for i in range(1, 11)]
print(squares) 

# output: [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]


# create a new list of even numbers from an existing list
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
evens = [i for i in numbers if i % 2 == 0]
print(evens)
# output: [2, 4, 6, 8, 10]


# create a new list of strings, where each string is the original string capitalized
words = ['apple', 'banana', 'cherry', 'date']
capitalized = [word.capitalize() for word in words]
print(capitalized) 
# output: ['Apple', 'Banana', 'Cherry', 'Date']
