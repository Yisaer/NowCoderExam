import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem35 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        if( pHead1 == null || pHead1 == null ){
            return null;
        }
        for(ListNode cur = pHead1 ; cur != null ; cur = cur.next){
            set.add(cur);
        }
        for(ListNode cur = pHead2;cur!=null ; cur=  cur.next){
            if( set.contains(cur)){
                return cur;
            }
        }
        return null;
    }

    public ListNode FindFirstCommonNode2(ListNode pHead1,ListNode pHead2){
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1 != p2){
            p1 = (p1 == null )?pHead2:p1.next;
            p2 = (p2 == null )?pHead1:p2.next;
        }
        return p1;
    }

}
