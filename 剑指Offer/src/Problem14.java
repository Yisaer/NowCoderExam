/**
 * Created by Yisa on 2017/4/10.
 */
public class Problem14 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head ;
        }
        if(head.next.next == null){
            ListNode res = head.next;
            res.next = head;
            head.next = null;
            return res;
        }
        ListNode Cur = head.next;
        ListNode Pre = head ;
        ListNode Next = Cur.next;
        head.next = null;
        for( ; Next != null ; ){
            Cur.next = Pre;
            Pre = Cur;
            ListNode tmpNext = Next;
            Next = Next.next;
            tmpNext.next  = Cur;
            Cur = tmpNext;
        }
        return Cur;
    }
}
