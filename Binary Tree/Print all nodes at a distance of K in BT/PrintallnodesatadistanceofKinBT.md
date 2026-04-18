Given the root of a binary tree, the value of a target node target, and an integer k. Return an array of the values of all nodes that have a distance k from the target node.
The answer can be returned in any order (N represents null).
Note: Although input shows target as a value, internally it refers to the TreeNode with that value.


Example 1
Input : root = [3, 5, 1, 6, 2, 0, 8, N, N, 7, 4] , target = 5, k = 2
Output : [1, 4, 7]
Explanation : The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.

Example 2
Input : root = [3, 5, 1, 6, 2, 0, 8, N, N, 7, 4] , target = 5, k = 3
Output : [0, 8]
Explanation : The nodes that are a distance 3 from the target node (with value 5) have values 0, 8.



Now your turn!
Input : root =[1, 2, 3, 4, null, 5, 6], target = 6, k = 2
Output:
Pick your answer
[2, 6]
[1, 5]
[8, 2]
[5, 4]


Constraints
1 <= Number of Nodes <= 103
-104 <= Node.val <= 104
All the values Node.val are unique.
target is the value of one of the nodes in the tree
0 <= k <= 103