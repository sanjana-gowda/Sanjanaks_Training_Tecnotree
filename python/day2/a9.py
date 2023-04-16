def square_list(numbers):
    """
    Returns a new list containing the squared elements of the input list.
    """
    # Initialize an empty list to store the squared elements
    squared_numbers = []

    # Iterate through each number in the input list
    for number in numbers:
        # Square the number and append it to the squared_numbers list
        squared_numbers.append(number ** 2)

    return squared_numbers

# Example usage
numbers = [1, 2, 3, 4, 5]
squared_numbers = square_list(numbers)
print(squared_numbers)
numbers = [1, 2, 3, 4, 5]
squared_numbers = square_list(numbers)
