
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
/**
 * Created by Yisa on 2017/4/15.
 */
public class Problem24 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {

        if(pHead == null){
            return null;
        }
        RandomListNode res = new RandomListNode(pHead.label);
        RandomListNode cur = pHead.next;
        RandomListNode now = res;
        for( ;  cur!=null ; cur = cur.next){
            RandomListNode Next = new RandomListNode(cur.label);
            now.next = Next;
            now = Next;
        }

        RandomListNode p1 = pHead;
        RandomListNode p2 = res;
        for( ; p1!=null && p2 !=null; p1 = p1.next,p2 = p2.next){
            if(p1.random == null){
                p2.random = null;
            }
            else{
                int count = 0;
                for(RandomListNode tmp = pHead ; tmp!= null ; tmp = tmp.next,count++){
                    if(tmp == p1.random){
                        break;
                    }
                }
                RandomListNode ptr = res;
                for(int i = 0; i <count;i++){
                    ptr = ptr.next;
                }
                p2.random = ptr;
            }
        }

        return res;
    }


    public RandomListNode Clone2 (RandomListNode pHead){
        RandomListNode p  = pHead;
        RandomListNode q = new RandomListNode(-1);
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode ,RandomListNode>();
        while( p != null){
            RandomListNode t = new RandomListNode(p.label);
            map.put(p,t);
            p = p.next;
            q.next = t;
            q = t;
        }

        Set<Entry<RandomListNode ,RandomListNode>> set = map.entrySet();
        Iterator<Entry<RandomListNode,RandomListNode>> it = set.iterator();
        while(it.hasNext()){
            Entry<RandomListNode,RandomListNode> next = it.next();
            next.getValue().random = map.get(next.getKey().random);
        }
        return map.get(pHead);

    }
}
