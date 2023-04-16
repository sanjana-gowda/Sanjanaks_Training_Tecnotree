def palindrome_strings(strings):
    """
    Returns a new list containing only the palindromic strings from the input list.
    """
    # Initialize an empty list to store the palindromic strings
    palindromes = []

    # Iterate through each string in the input list
    for string in strings:
        # If the string is the same forwards and backwards, it is a palindrome
        if string == string[::-1]:
            # Append the string to the palindromes list
            palindromes.append(string)

    return palindromes

# Example usage
strings = ["racecar", "hello", "level", "world", "deified"]
palindromic_strings = palindrome_strings(strings)
print(palindromic_strings)
strings = ["racecar", "hello", "level", "world", "deified"]
palindromic_strings = palindrome_strings(strings)
