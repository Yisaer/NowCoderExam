import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Yisa on 2017/4/24.
 */
public class Problem55 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(pHead == null ){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }
        ListNode res = new ListNode(0);
        ListNode ans = res;
        for(ListNode cur= pHead ;cur != null ; cur = cur.next ){
            int key = cur.val;
            if(map.containsKey(key)){
                int val = map.get(key);
                val++;
                map.put(key,val);
            }
            else{
                map.put(key,1);
                arrayList.add(key);
            }
        }
        for(int num :arrayList){
            if(map.get(num) == 1){
                ListNode cur  = new ListNode(num);
                res.next = cur;
                res = res.next;
            }
        }
        return ans.next;
    }
}
