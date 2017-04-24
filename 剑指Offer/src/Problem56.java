/**
 * Created by Yisa on 2017/4/24.
 */
public class Problem56 {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null ){
            return null;
        }
        if(pNode.right != null){
            TreeLinkNode res =pNode.right;
            while(res.left!=null){
                res = res.left;
            }
            return res;
        }
        while(pNode.next != null ){
            TreeLinkNode par = pNode.next;
            if(pNode == par.left){
                return par;
            }
            pNode = pNode.next;
        }
        return null;
    }
}
