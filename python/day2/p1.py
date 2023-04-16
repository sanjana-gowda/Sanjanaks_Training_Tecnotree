while True:
    try:
        numerator = float(input("Enter numerator: "))
        denominator = float(input("Enter denominator: "))
        result = numerator / denominator
        print(f"{numerator} / {denominator} = {result}")
        break
    except ZeroDivisionError:
        print("Error: Division by zero is not allowed. Please enter a non-zero denominator.")
