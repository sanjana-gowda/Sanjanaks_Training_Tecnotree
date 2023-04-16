def calculate_median(numbers):
    """
    Returns the median value of a list of numbers.
    """
    numbers.sort()
    length = len(numbers)
    if length % 2 == 0:
        # If the list has an even number of elements, take the average of the middle two
        return (numbers[length // 2 - 1] + numbers[length // 2]) / 2
    else:
        # If the list has an odd number of elements, return the middle element
        return numbers[length // 2]

# Example usage
number_list = [4, 7, 1, 9, 2, 5, 8]
median = calculate_median(number_list)
print(median)
number_list = [4, 7, 1, 9, 2, 5, 8]
median = calculate_median(number_list)
