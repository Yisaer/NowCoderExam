import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yisa on 2017/4/11.
 */
public class Problem16 {
    public class TreeNode {
        int val = 0;
    TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public boolean isSubTree(TreeNode A,TreeNode B){
        if( B == null){
            return true;
        }
        if( A == null){
            return false;
        }

        if(A.val == B.val){
            return isSubTree(A.left,B.left) && isSubTree(A.right,B.right);
        }
        else{
            return false;
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if(root1 != null && root2 !=null){
            if( root1.val == root2.val ){
                res = isSubTree(root1,root2);
            }
            if(!res){
                res = HasSubtree(root1.right,root2);
            }
            if(!res){
                res = HasSubtree(root1.left,root2);
            }
        }
        return res;
    }
}
