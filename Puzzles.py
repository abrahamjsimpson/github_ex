# problems pulled from codingbat.com
# and format adapted from google python class:
# http://code.google.com/edu/languages/google-python-class


#==================SUM~28==============/
# Problem statement:
    # Given an array of ints,
    # return true if the sum of all the 2's
# in the array is exactly 8.
# Example input -> output:
    # sum28([2, 3, 2, 2, 4, 2]) -> true
    # sum28([2, 3, 2, 2, 4, 2, 2]) -> false
    # sum28([1, 2, 3, 4]) -> false
def sum28(nums):
    # +++your code here+++
    sum = 0
    for i in range (1, len(nums))
        if nums[i] == 2
            sum += 2
    if sum == 8
        return true
    return false


#=================ONLY~14==================/
# Problem statement:
    # Given an array of ints, return true if every element is a 1 or a 4.
# Example input -> output:
    # only14([1, 4, 1, 4]) -> true
    # only14([1, 4, 2, 4]) -> false
    # only14([1, 1]) -> true


def only14(nums):
    for i in nums:
        if not (i == 1 or i == 4):
            return False
    return True

# Provided simple test() function in main() to print
# what each function returns vs. what it's supposed to return
def test(got, expected):
    if got == expected:
        prefix = ' OK '
    else:
        prefix = ' X '
    print (f'{prefix} got: {repr(got)} expected: {repr(expected)}')

# Provided main() calls the above functions with a ew winputs
# using test() to check if each result is correct or not
def main():
    print 'sum28'
    test(sum28([2, 3, 2, 2, 4, 2]), True)
    test(sum28([1, 2, 3, 4]), False)
    test(sum28([2]), False)

    print
    print 'only14'
    test(only14([1, 4, 1, 4]), True)

    test(only14([1, 4, 2, 4]), False)
    test(only14([1, 1, 1, 5]), False)

# Standard boilerplate to call the main() function
if __name__ == '__main__':
    main()
