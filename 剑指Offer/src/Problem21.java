/**
 * Created by Yisa on 2017/4/12.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Problem21 {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> arrarList = new ArrayList<Integer>();
        if(root == null){
            return arrarList;
        }
        Queue<TreeNode > queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            arrarList.add(cur.val);
            if(cur.left != null ){
                queue.offer(cur.left);
            }
            if(cur.right != null ){
                queue.offer(cur.right);
            }
        }
        return arrarList;
    }
}
