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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      int n=preorder.length;
      int m=inorder.length;
      Map<Integer,Integer> inmap=new HashMap<Integer,Integer>();
      for(int i=0;i<inorder.length;i++){
        inmap.put(inorder[i],i);
      }  
      TreeNode root=build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inmap);
      return root;
    }
    public TreeNode build(int []preorder,int prest,int preend,int []inorder,int inst,int inend,Map<Integer,Integer>inmap){
        if(prest>preend || inst>inend){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prest]);
        int inroot=inmap.get(root.val);
        int numsleft=inroot-inst;
        root.left=build(preorder,prest+1,prest+numsleft,inorder,inst,inroot-1,inmap);
        root.right=build(preorder,prest+numsleft+1,preend,inorder,inroot+1,inend,inmap);
        return root;
    }
}