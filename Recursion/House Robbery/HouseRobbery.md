A robber is targeting to rob houses from a street. Each house has security measures that alert the police when two adjacent houses are robbed. The houses are arranged in a circular manner, thus the first and last houses are adjacent to each other.
Given an integer array money, where money[i] represents the amount of money that can be looted from the (i+1)th house. Return the maximum amount of money that the robber can loot without alerting the police.

Example 1
Input: money = [2, 1, 4, 9]
Output: 10
Explanation:
[2, 1, 4, 9] The underlined houses would give the maximum loot.

Note that we cannot loot the 1st and 4th houses together.

Example 2
Input: money = [1, 5, 2, 1, 6]
Output: 11
Explanation:
[1, 5, 2, 1, 6] The underlined houses would give the maximum loot.

Example 3
Input: money = [9, 4, 1, 8]
Output:
12

Constraints
1 <= money.length <= 105
0 <= money[i] <= 1000