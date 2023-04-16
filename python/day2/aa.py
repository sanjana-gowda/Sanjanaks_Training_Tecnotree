import time
#taking function 
def measure_time(func):
    def wrapper(*args, **kwargs):
        start_time = time.time()
        result = func(*args, **kwargs)
        end_time = time.time()
        print(f"Function {func.__name__} took {end_time - start_time:.6f} seconds to execute.")
        return result
    return wrapper

@measure_time
def my_function():
    # do some work
    time.sleep(1)

my_function()
