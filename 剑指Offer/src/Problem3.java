import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem3 {

         public class ListNode {
             int val;
             ListNode next = null;

             ListNode(int val) {
                 this.val = val;
             }
         }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        ListNode curNode = listNode;
        for(;curNode != null ;curNode = curNode.next){
            s.push(curNode.val);
        }
        while(!s.empty()){
            int num = s.pop();
            arrayList.add(num);
        }
        return arrayList;
    }
}
