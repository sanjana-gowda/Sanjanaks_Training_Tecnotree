def find_longest_word(word_list):
    """
    Returns the longest word in a list of words.
    """
    longest_word = ""
    for word in word_list:
        if len(word) > len(longest_word):
            longest_word = word
    return longest_word

# Example usage
word_list = ["apple", "banana", "cherry", "durian", "elderberry"]
longest_word = find_longest_word(word_list)
print(longest_word)
word_list = ["apple", "banana", "cherry", "durian", "elderberry"]
longest_word = find_longest_word(word_list)
