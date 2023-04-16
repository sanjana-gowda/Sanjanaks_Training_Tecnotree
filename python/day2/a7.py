def is_prime(num):
    """
    Returns True if a number is prime, False otherwise.
    """
    if num <= 1:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

def find_prime_numbers(num_list):
    """
    Returns a new list with only the prime numbers from a given list of numbers.
    """
    prime_numbers = []
    for num in num_list:
        if is_prime(num):
            prime_numbers.append(num)
    return prime_numbers

# Example usage
num_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
prime_numbers = find_prime_numbers(num_list)
print(prime_numbers)
num_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
prime_numbers = find_prime_numbers(num_list)
