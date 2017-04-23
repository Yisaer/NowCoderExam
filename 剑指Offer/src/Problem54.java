/**
 * Created by Yisa on 2017/4/23.
 */
public class Problem54 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        ListNode p1 =pHead;
        ListNode p2 =pHead;
        do{
            p1 = p1.next;
            p2 = p2.next.next;
        }while(p1!=p2);
        return p1;
    }
}
