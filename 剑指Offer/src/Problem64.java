import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Yisa on 2017/4/25.
 */


public class Problem64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(num.length == 0 || num.length<size || size <1 ){
            return arrayList;
        }
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i = 0 ; i<size-1;i++){
            while(!deque.isEmpty() && num[i]>num[deque.getLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        for(int i = size - 1; i<num.length;i++){
            while(!deque.isEmpty() && num[i]>num[deque.getLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
            if(i-deque.getFirst()+1 >size){
                deque.removeFirst();
            }
            arrayList.add(num[deque.getFirst()]);
        }
        return arrayList;
    }
}
