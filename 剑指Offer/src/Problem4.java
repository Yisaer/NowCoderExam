/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem4 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = returnNode(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }

    private TreeNode returnNode (int [] pre,int sPre , int ePre ,int [] in,int sIn,int eIn){
        if( sPre > ePre || sIn > eIn){
            return null;
        }
        TreeNode root = new TreeNode(pre[sPre]);
        for(int  i = sIn;i <= eIn ;i++){
            if(in[i] == pre[sPre]){
                root.left = returnNode(pre,sPre+1,i-sIn+sPre,in,sIn,i-1);
                root.right = returnNode(pre,i-sIn+sPre+1,ePre,in,i+1,eIn);

            }
        }
        return root;
    }

}
