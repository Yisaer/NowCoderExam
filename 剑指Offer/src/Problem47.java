/**
 * Created by Yisa on 2017/4/17.
 */
public class Problem47 {
    public int Add(int num1,int num2) {
        int n1 ,n2;
        n1 = (num1&num2)<<1;
        n2 = num1^num2;
        while((n1&n2)!=0){
            num1= n1;
            num2 = n2;
            n1 = (num1&num2)<<1;
            n2 = num1^num2;
        }
        return n1|n2;
    }
}
