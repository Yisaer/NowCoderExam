import java.util.Stack;

/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            s1tos2(stack1,stack2);
        }
        return stack2.pop();
    }

    private void s1tos2(Stack<Integer> s1,Stack<Integer> s2){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
    }
}
