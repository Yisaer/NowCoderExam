/**
 * Created by Yisa on 2017/4/11.
 */
public class Problem15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1 == null && list2 == null){
            return null;
        }

        ListNode root = new ListNode(0);
        ListNode cur = root;
        for( ;list1 !=null && list2 != null ; ){
            if(list1.val <= list2.val){
                cur.val = list1.val;
                list1 = list1.next;
            }
            else {
                cur.val = list2.val;
                list2 = list2.next;
            }
            ListNode Next = new ListNode(0);
            cur.next = Next;
            cur = Next;
        }
        if(list1 == null){
            cur.val = list2.val;
            cur.next = list2.next;
        }
        if(list2 == null){
            cur.val = list1.val;
            cur.next = list1.next;
        }
        return root;
    }
    public ListNode Merg2(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode root;
        ListNode p1 = list1;
        ListNode p2 = list2;
        if(list1.val <= list2.val){
            root = list1;
            p1 = p1.next;
        }
        else{
            root = list2;
            p2 = p2.next;
        }
        ListNode cur = root;
        while(p1!=null && p2!=null){
            if(p1.val <=p2.val){
                cur.next = p1;
                p1 = p1.next;
            }
            else{
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if(p1 == null){
            cur.next = p2;
        }
        if(p2 == null){
            cur.next = p1;
        }
        return root;
    }
}
