import java.util.*;

/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem33 {
    public int FirstNotRepeatingChar(String str) {
        if(str.equals("")||str == null ){
            return -1;
        }
        char [] chars = str.toCharArray();
        int[] F = new int[52];
        for(int i = 0 ; i<52;i++){
            F[i] = 0;
        }
        Deque<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i  = 0; i<chars.length;i++){
            int num = 0;
            if(chars[i] >= 'a' && chars[i] <='z'){
                num = chars[i] - 'a';
                F[num] ++;
            }
            else if( chars[i] >='A' && chars[i] <='Z'){
                num = chars[i] - 'A'+26;
                F[num]++;
            }
            if(F[num] == 1){
                queue.addLast(num);
                map.put(num,i);
            }
            if(F[num] == 2){
                int cur = -1;
                while(true ){
                    cur = queue.pollFirst();
                    if(cur == num){
                        break;
                    }
                    stack.push(cur);
                }
                while(!stack.isEmpty()){
                    cur  = stack.pop();
                    queue.addFirst(cur);
                }
                map.remove(num);
            }
        }
        if(queue.isEmpty()){
            return -1;
        }
        int num = queue.pollFirst();
        return map.get(num);
    }

    public int FirstNotRepeatingChar2(String str){
        if(str.equals("")||str == null ){
            return -1;
        }
        char [] chars = str.toCharArray();
        int[] F = new int[52];
        for(int i = 0 ; i<52;i++){
            F[i] = 0;
        }
        for(int i = 0 ; i<chars.length;i++){
            int num = 0;
            if(chars[i] >= 'a' && chars[i] <='z'){
                num = chars[i] - 'a';
                F[num] ++;
            }
            else if( chars[i] >='A' && chars[i] <='Z'){
                num = chars[i] - 'A'+26;
                F[num]++;
            }
        }
        for(int i =0;i<chars.length;i++){
            int num = 0;
            if(chars[i] >= 'a' && chars[i] <='z'){
                num = chars[i] - 'a';
            }
            else if( chars[i] >='A' && chars[i] <='Z'){
                num = chars[i] - 'A'+26;
            }
            if(F[num] == 1){
                return i;
            }
        }
        return -1;
    }
}
