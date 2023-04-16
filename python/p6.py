
numbers = input("Enter a list of numbers separated by spaces: ")


numbers_list = [float(n) for n in numbers.split()]


print("Largest number:", max(numbers_list))
print("Smallest number:", min(numbers_list))
