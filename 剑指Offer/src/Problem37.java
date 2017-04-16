/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem37 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private int max(int a, int b){
        if(a>= b){
            return a;
        }
        else{
            return b;
        }
    }

    private int Deep(TreeNode cur){
        if( cur.left == null && cur.right == null){
            return 1;
        }
        if( cur.left == null && cur.right != null ){
            return Deep(cur.right)+1;
        }
        if( cur.left != null && cur.right == null ){
            return Deep(cur.left)+1;
        }
        return max(Deep(cur.left),Deep(cur.right))+1;
    }

    public int TreeDepth(TreeNode root) {
        if(root == null ){
            return 0 ;
        }
        int depth = Deep(root);
        return depth;
    }
}
