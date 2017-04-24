/**
 * Created by Yisa on 2017/4/24.
 */
public class Problem57 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    boolean cmpNode(TreeNode leftNode ,TreeNode rightNode){
        if( leftNode == null ){
            return rightNode == null;
        }
        if(rightNode == null ){
            return false;
        }
        if(rightNode.val != leftNode.val ){
            return false;
        }
        return cmpNode(leftNode.left,rightNode.right) && cmpNode(leftNode.right,rightNode.left);

    }

    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){
            return true;
        }
        return cmpNode(pRoot.left,pRoot.right);
    }
}
