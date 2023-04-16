
def my_decorator(func):
    def wrapper():
        print("Before function is called.")
        func()
        print("After function is called.")
    return wrapper

@my_decorator
def say_hello():
    print("Sanjana Gowda!")

# calling the decorated function
say_hello()

