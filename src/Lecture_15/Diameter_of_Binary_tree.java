package Lecture_15;

public class Diameter_of_Binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int result = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) 
    {
      height(root);
        return result -1;
    }
    
    private int height(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        int maxHeight= Math.max(left , right) +1;
        result = Math.max(result , left+right+1);
        return maxHeight;
    }

}
