
/**
 * Created by Yisa on 2017/4/10.
 */
public class Problem13 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = 0;
        for(ListNode cur = head ; cur !=null ;cur = cur.next){
            len++;
        }

        int step = len - k ;
        if(step <0){
            return null;
        }
        ListNode res = head;
        for(int  i =0;i<step;i++){
            res = res.next;
        }
        return res;
    }
}
