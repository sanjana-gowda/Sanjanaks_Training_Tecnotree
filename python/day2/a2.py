def remove_vowels(string):
    """
    Returns a new string with all vowels removed.
    """
    vowels = "aeiouAEIOU"
    new_string = ""
    for char in string:
        if char not in vowels:
            new_string += char
    return new_string
string = "Hello, world!"
remove_vowels(string)
print(remove_vowels(string))

