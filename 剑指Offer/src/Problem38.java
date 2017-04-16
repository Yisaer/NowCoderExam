/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem38 {

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
        if(cur == null ){
            return 0 ;
        }
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

    private int abs(int a){
        if(a>=0){
            return a;
        }
        else{
            return -a;
        }
    }

    private boolean IsBalance(TreeNode cur){
        if(cur == null ){
            return true;
        }
        if(cur.left ==null && cur.right == null){
            return true;
        }
        if(abs(Deep(cur.left)-Deep(cur.right))>1){
            return false;
        }
        return IsBalance(cur.left)&IsBalance(cur.right);

    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return IsBalance(root);
    }
}
