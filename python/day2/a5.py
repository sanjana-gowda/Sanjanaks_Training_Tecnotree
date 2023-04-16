def find_common_elements(list1, list2):
    """
    Returns a new list with the elements that appear in both input lists.
    """
    common_elements = []
    for num in list1:
        if num in list2 and num not in common_elements:
            common_elements.append(num)
    return common_elements

# Example usage
list1 = [1, 2, 3, 4, 5]
list2 = [3, 4, 5, 6, 7]
common_elements = find_common_elements(list1, list2)
print(common_elements)
list1 = [1, 2, 3, 4, 5]
list2 = [3, 4, 5, 6, 7]
common_elements = find_common_elements(list1, list2)
