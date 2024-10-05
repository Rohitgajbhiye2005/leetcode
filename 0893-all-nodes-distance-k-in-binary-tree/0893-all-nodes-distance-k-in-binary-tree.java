/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    private void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            
            if (current.left != null) {
                parent_track.put(current.left, current);
                queue.offer(current.left);
            }
            
            if (current.right != null) {
                parent_track.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent_track = new HashMap<>(); 
        markParents(root, parent_track); 
        
        Map<TreeNode, Boolean> visited = new HashMap<>(); 
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target, true);
        
        int curr_level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (curr_level == k) break; 
            curr_level++;
            
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                
                
                if (current.left != null && !visited.containsKey(current.left)) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }
                
             
                if (current.right != null && !visited.containsKey(current.right)) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }
                
                
                if (parent_track.get(current) != null && !visited.containsKey(parent_track.get(current))) {
                    queue.offer(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                }
            }
        }

    
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.val);
        }
        
        return result;
    }
}