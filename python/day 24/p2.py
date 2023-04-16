def is_prime(num):
    if num == 1:
        return False

    # Check if num is divisible by any number between 2 and sqrt(num)
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
            break

    # If num is not divisible by any number between 2 and sqrt(num),
    # then it is a prime number.
    return True


def test_is_prime():
    assert is_prime(3) == True
    assert is_prime(2) == True



if __name__ == '__main__':
    test_is_prime()