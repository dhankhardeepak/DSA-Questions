/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //your code goes here
        //Parent Marking
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        markParents(root, parent);

        // Main Logic
        HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.add(target);

        while(!q.isEmpty()){
            int n = q.size();
            if(k == 0) break;
            for(int i = 0; i < n; i++){
                TreeNode top = q.peek();
                q.poll();
                //left
                if(top.left != null && !visited.contains(top.left)){
                    q.add(top.left);
                    visited.add(top.left);
                }

                //right
                if(top.right != null && !visited.contains(top.right)){
                    q.add(top.right);
                    visited.add(top.right);
                }

                //parent
                TreeNode par = parent.get(top);
                if(par != null && !visited.contains(par)){
                    q.add(par);
                    visited.add(par);
                }

                
            }
            k--;
        }

        List<Integer> ls = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode top = q.peek();
            q.poll();
            ls.add(top.data);
        }

        return ls;
    }

    public void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parent){
        if(root == null) return;

        if(root.left != null) parent.put(root.left, root);
        markParents(root.left, parent);

        if(root.right != null) parent.put(root.right, root);
        markParents(root.right, parent);
    }
}