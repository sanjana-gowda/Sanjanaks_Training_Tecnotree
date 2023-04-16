import math

# Ask user to enter radius
radius = float(input("Enter radius: "))


area = math.pi * radius ** 2
circumference = 2 * math.pi * radius


print("For a circle with radius", radius, ":")
print("Area =", area)
print("Circumference =", circumference)
