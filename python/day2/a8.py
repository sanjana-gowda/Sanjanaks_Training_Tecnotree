def count_letters(string):
    """
    Returns a dictionary containing the count of each letter in the input string.
    """
    # Initialize an empty dictionary to store the counts
    counts = {}

    # Iterate through each character in the string
    for char in string:
        # Ignore non-letter characters
        if not char.isalpha():
            continue
        # Convert the character to lowercase for case-insensitivity
        char = char.lower()
        # If the character is already in the dictionary, increment its count
        if char in counts:
            counts[char] += 1
        # If the character is not in the dictionary, add it with a count of 1
        else:
            counts[char] = 1

    return counts


string = "Hello, World!"
letter_counts = count_letters(string)
print(letter_counts)
string = "Hello, World!"
letter_counts = count_letters(string)
