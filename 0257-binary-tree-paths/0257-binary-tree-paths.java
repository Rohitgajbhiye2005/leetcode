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
    public static void path(TreeNode root,List<String> ans,StringBuilder str)
    {
        if(root==null)
        {
            return;
        }
        int len=str.length();
        if(len>0)
            str.append("->");
        str.append(root.val);
        if(root.left==null && root.right==null)
            ans.add(str.toString());
        else {
            path(root.left,ans,str);
            path(root.right,ans,str);
        }
        str.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        path(root,ans,new StringBuilder());
        return ans;
    }
}