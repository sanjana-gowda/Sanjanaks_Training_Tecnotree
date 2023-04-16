
numbers = input("Enter a list of numbers separated by spaces: ")
numbers_list = [int(num) for num in numbers.split()]

even_sum = sum(num for num in numbers_list if num % 2 == 0)
print("Sum of even numbers:", even_sum)
