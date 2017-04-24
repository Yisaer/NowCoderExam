import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yisa on 2017/4/24.
 */
public class Problem60 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    String Serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null ) {
            return "#";
        }
        queue.add(root);
        String res = "";
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur == null ){
                res += "#,";
                continue;
            }
            int val = cur.val;
            String num = new Integer(val).toString() +",";
            res+=num;
            if(cur.left != null ){
                queue.add(cur.left);
            }
            else{
                queue.add(null);
            }
            if(cur.right != null ){
                queue.add(cur.right);
            }
            else{
                queue.add(null);
            }
        }
        return res;
    }

    TreeNode Deserialize(String str) {
        String[] node = str.split(",");
        if(node.length == 1 && node[0].equals("#")){
            return null;
        }
        for(int i = 0; i<node.length;i++){
            System.out.print(node[i]+",");
        }

        TreeNode root = new TreeNode(Integer.parseInt(node[0]));
        TreeNode cur = root;
        int p = 0;
        boolean isLeft = true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        for(int i =1;i<node.length;i++){
            System.out.println("i = "+i);
            if (node[i].equals("#")) {
                if(isLeft == true){
                    cur.left = null;
                    isLeft = false;
                }
                else{
                    cur.right = null;
                    isLeft = true;
                    queue.poll();
                    cur = queue.peek();
                }
            }
            else{
                int val = Integer.parseInt(node[i]);
                TreeNode tmp = new TreeNode(val);
                if(isLeft == true){
                    cur.left = tmp;
                    isLeft = false;
                }
                else{
                    cur.right = tmp;
                    isLeft = true;
                    queue.poll();
                }
                queue.add(tmp);
                cur = queue.peek();

            }
        }
        return root;
    }
}
