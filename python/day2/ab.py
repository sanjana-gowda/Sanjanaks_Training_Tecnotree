#array list
my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9]

filtered_list = list(filter(lambda x: x % 2 != 0, my_list))
doubled_list = [x * 2 for x in filtered_list]
#odd number is doubled
print(doubled_list)
[2, 6, 10, 14, 18]

my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9]

doubled_list = [x * 2 for x in my_list if x % 2 != 0]
#it is resulting
print(doubled_list)
