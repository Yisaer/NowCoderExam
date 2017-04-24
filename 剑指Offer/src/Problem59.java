/**
 * Created by Yisa on 2017/4/24.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Problem59 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null ){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(null);
        queue.add(pRoot);
        boolean isNullPre = false;
        ArrayList<Integer> tmp = null;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur == null){
                isNullPre = true;
                continue;
            }
            if(isNullPre == true){
                queue.add(null);
                isNullPre = false;
                tmp = new ArrayList<Integer>();
            }
            tmp.add(cur.val);
            if(cur.left !=null ){
                queue.add(cur.left);
            }
            if(cur.right != null ){
                queue.add(cur.right);
            }
            if(queue.peek() == null){
                res.add(tmp);
            }
        }
        return res;
    }
}
