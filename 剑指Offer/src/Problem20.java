/**
 * Created by Yisa on 2017/4/12.
 */
import java.util.ArrayList;
import java.util.Stack;

public class Problem20 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int p1 = 0;
        int p2= 0;
        int len = pushA.length;
        for(p1 = 0; p1<len;){
            if(pushA[p1] == popA[p2]){
//                System.out.println("here if");
                p1++;p2++;
                while(!stack.empty()){

                    int data = stack.peek();
//                    System.out.println("in loop, peek = "+data +" ,cmp = "+popA[p2]);
                    if(data == popA[p2]){
                        p2++;
                        stack.pop();
                    }
                    else{
                        break;
                    }
                }
            }else{
//                System.out.println("here else");
                stack.push(pushA[p1]);
                p1++;
            }
        }
        while(!stack.empty()){
            int data = stack.peek();
            if(data == popA[p2]){
                p2++;
                stack.pop();
            }
            else{
                break;
            }
        }

        if(stack.empty()){
            return true;
        }

        return false;
    }
}


//
//1 2 3 4
//3 2 1 4