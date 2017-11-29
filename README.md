# HighestProductOfThree
Given an array of integers, find the highest product you can get from three of  the integers. The solution computes in O(N) time and O(1) space.

Solution:
- Scan the array and compute Maximum, second maximum and third maximum 
    element present in the array.
    - Scan the array and compute Minimum and second minimum element present in 
    the array.
    - Return the maximum of product of Maximum, second maximum and third maximum 
    and product of Minimum, second minimum and Maximum element.
