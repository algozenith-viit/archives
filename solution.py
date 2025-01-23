"""Problem: Gifts needed for Vignan contributors

Your task is to find the total number of gifts needed for Vignan contributors such that for given N number of contributors where valued from 1 to N numbers and requires gifts based on their values such that each contributor gets number of gifts equal to cube of value of respected contributor.

Input Specification:
- input1: An integer value N.

Output Specification:
Return an integer value representing the total number of gifts needed for N number of contributors.

Example 1:
Input: 3
Output: 36

Example 2:
Input: 2
Output: 9
"""

n = int(input())
temp = n * (n+1)
res = (temp // 2)* (temp // 2)
print(res)

# for input 3: 
#(1)^3 + (2)^3 + (3)^3 = 36  (general method).
# ( (3* (3+1) ) //2 )^2 = 36   (using formula of sum of cubes of 1st n natural numbers.
