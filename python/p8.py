# Ask user to enter a list of names
names = input("Enter a list of names separated by spaces: ")

# Convert input string to list of strings
names_list = names.split()

# Sort list of names in alphabetical order
names_list.sort()

# Print sorted list of names
print("Sorted names:", ", ".join(names_list))
