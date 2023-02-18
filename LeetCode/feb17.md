# Feb17 of DSA on LeetCode

# 783. Minimum Distance Between BST Nodes [Easy Level]

## Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

### Example 1:

![image](https://user-images.githubusercontent.com/73644685/219712816-806e62d3-cd3e-41dd-9d74-a44ce7621ba1.png)


```
Input: root = [4,2,6,1,3]
Output: 1
```

### Example 2:

![image](https://user-images.githubusercontent.com/73644685/219712846-96f52a38-5d3d-41e9-a35f-30aa982c82c8.png)


```
Input: root = [1,0,48,null,null,12,49]
Output: 1
```

# Constraints:

- The number of nodes in the tree is in the range [2, 100].
- 0 <= Node.val <= 105


# JAVA SOLUTION 💻

```
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
    int min=Integer.MAX_VALUE;
    Integer prev=null;
    public int minDiffInBST(TreeNode root) {
       if(root.left!=null) minDiffInBST(root.left);
       if(prev!=null) min=Math.min(min,root.val-prev);
       prev=root.val;
       if(root.right!=null)minDiffInBST(root.right);
      return min;  
    }
}
```
