import java.util.ArrayList;

/**
 * Created by Yisa on 2017/4/13.
 */
public class Problem23 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }

    }
    public void dfs(ArrayList<ArrayList<Integer>> res , TreeNode cur , int target,int sum,String path ){
        int num = cur.val;
        path+= num+",";
        if(cur.left != null){
            dfs(res,cur.left,target,sum+num,path);
        }
        if(cur.right != null ){
            dfs(res,cur.right,target,sum+num,path);
        }
        if(cur.left == null && cur.right == null){
            if( target == sum +num){
                ArrayList<Integer> ans = new ArrayList<Integer>();
                String[] str  = path.split(",");
                for(String s :str){
                    ans.add(Integer.parseInt(s));
                }
                res.add(ans);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return res;
        }
        dfs(res,root,target,0,"");
        return res;
    }
}
