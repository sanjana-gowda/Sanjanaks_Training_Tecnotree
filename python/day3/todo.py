import os

# Define the path to the text file where the to-do list items will be stored
todo_file = "todo.txt"

# Define the function for displaying the to-do list
def display_list():
    if os.path.exists(todo_file):
        with open(todo_file, "r") as f:
            items = f.readlines()
            if items:
                for i, item in enumerate(items, start=1):
                    print(f"{i}. {item.strip()}")
            else:
                print("No to-do items found.")
    else:
        print("No to-do items found.")

# Define the function for adding to the to-do list
def add_item():
    item = input("Enter a new to-do item: ")
    with open(todo_file, "a") as f:
        f.write(item + "\n")
    print(f"{item} added to the to-do list.")

# Define the function for updating a to-do list item
def update_item():
    display_list()
    item_num = int(input("Enter the number of the item you want to update: "))
    with open(todo_file, "r") as f:
        items = f.readlines()
    if item_num <= len(items):
        new_item = input("Enter the new item text: ")
        items[item_num - 1] = new_item + "\n"
        with open(todo_file, "w") as f:
            f.writelines(items)
        print("To-do item updated.")
    else:
        print("Invalid item number.")

# Define the function for deleting a to-do list item
def delete_item():
    display_list()
    item_num = int(input("Enter the number of the item you want to delete: "))
    with open(todo_file, "r") as f:
        items = f.readlines()
    if item_num <= len(items):
        item = items.pop(item_num - 1)
        with open(todo_file, "w") as f:
            f.writelines(items)
        print(f"{item.strip()} deleted from the to-do list.")
    else:
        print("Invalid item number.")

# Define the main function for the application
def main():
    while True:
        print("\nTo-Do List\n")
        print("1. Display to-do list")
        print("2. Add to-do item")
        print("3. Update to-do item")
        print("4. Delete to-do item")
        print("5. Exit")
        choice = input("\nEnter your choice (1-5): ")
        if choice == "1":
            display_list()
        elif choice == "2":
            add_item()
        elif choice == "3":
            update_item()
        elif choice == "4":
            delete_item()
        elif choice == "5":
            print("Exiting...")
            break
        else:
            print("Invalid choice. Try again.")

# Call the main function to run the application
if __name__ == "__main__":
    main()
