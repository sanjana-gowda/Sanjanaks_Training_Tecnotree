def sum_even_numbers(numbers):
    """
    Returns the sum of all even numbers in the given list of numbers.
    """
    even_sum = 0
    for num in numbers:
        if num % 2 == 0:
            even_sum += num
    return even_sum

# Get a list of numbers from the user
num_list = []
while True:
    num = input("Enter a number (or 'q' to quit): ")
    if num == 'q':
        break
    try:
        num_list.append(int(num))
    except ValueError:
        print("Invalid input. Please enter a valid number.")

# Print the sum of even numbers in the list
print("The sum of even numbers in the list is:", sum_even_numbers(num_list))
