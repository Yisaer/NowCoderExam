/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem11 {

    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;

        while( flag != 0){
            if (( n&flag ) !=0){
                count++;
            }
            flag = flag <<=1;
        }

        return count;
    }
}
