/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        if(root==null) return ans;

        que.offer(root);
        while(!que.isEmpty()){
            int level=que.size();
            List<Integer> sublist=new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(que.peek().left !=null) que.offer(que.peek().left);
                if(que.peek().right !=null) que.offer(que.peek().right);
                sublist.add(que.poll().val);
            }
            ans.add(sublist);
        }
        return ans;
    }
}