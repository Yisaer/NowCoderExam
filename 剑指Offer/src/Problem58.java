import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Yisa on 2017/4/24.
 */
public class Problem58 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(null);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return res;
        }
        queue.add(pRoot);
        boolean isNullPre = false;
        ArrayList<Integer> tmp = null;
        int count = 1;
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur == null ){
                isNullPre = true;
                continue;
            }
            if(isNullPre == true){
                isNullPre = false;
                queue.add(null);
                count++;
                tmp = new ArrayList<Integer>();
                stack.clear();
            }
            if(cur.left !=null ){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }
            if(count %2 == 1){
                stack.push(cur.val);
            }
            else{
                tmp.add(cur.val);
            }

            if(queue.peek()==null){
                if(count %2 == 1){
                    while(!stack.empty()){
                        int val = stack.pop();
                        tmp.add(val);
                    }
                }
                res.add(tmp);
            }
        }
        return res;
    }
}
