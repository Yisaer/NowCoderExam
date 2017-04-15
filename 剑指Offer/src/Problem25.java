import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yisa on 2017/4/15.
 */
public class Problem25 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public  void pushIntoQueue(Queue<TreeNode> queue,TreeNode cur){
        if(cur.left!= null){
            pushIntoQueue(queue,cur.left);
        }
        queue.add(cur);
        if(cur.right != null){
            pushIntoQueue(queue,cur.right);
        }
    }
    public void solve(Queue<TreeNode> queue,TreeNode root){
        if(root.left!= null ){
            pushIntoQueue(queue,root.left);
        }
        queue.add(root);
        if(root.right !=null){
            pushIntoQueue(queue,root.right);
        }
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        solve(queue,pRootOfTree);
        TreeNode p1 = queue.poll();
        TreeNode res = p1;
        while(!queue.isEmpty()){
            TreeNode p2 = queue.poll();
            p1.right = p2;
            p2.left = p1;
            p1 = p2;
        }
        return res;
    }

    public TreeNode Convert2(TreeNode root) {
        if( root == null){
           return null;
        }
        if( root.right == null && root.left == null){
           return root;
        }
        TreeNode left = Convert2(root.left);
        TreeNode p  =left;
        while(p!=null && p.right!=null){
            p = p.right;
        }
        if(left!= null ){
            p.right = root;
            root.left = p;
        }
        TreeNode right = Convert(root.right);
        if(right!=null){
            right.left = root;
            root.right = right;
        }
        return left!=null?left:root;
    }
}
