Given an integer array nums sorted in non-decreasing order and an integer target, return true if target is a majority element, or false otherwise.
A majority element in an array nums is an element that appears more than nums.length / 2 times in the array.


Example 1
Input: nums = [1,2,3,3,3,3,3,4,5], target = 3 
Output: true 
Explanation: The value 3 appears 5 times and the length of the array is 9. Thus, 3 is a majority element because 5 > 9/2 is true.

Example 2
Input: nums = [7,8,8,8,9,9,9,10,11], target = 8 
Output: false 
Explanation: The value 8 appears 3 times and the length of the array is 9. Thus, 8 is not a majority element because 3 > 9/2 is false.

Constraints
1 <= nums.length <= 1000
1 <= nums[i], target <= 10^9
nums is sorted in non-decreasing order.