import java.util.ArrayList;

/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem41 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int p1 = 0;
        int p2 = array.length-1;
        int a = -1;
        int b = -1;
        int muti = Integer.MAX_VALUE;
        for( ; p1<p2; ){
            int num = array[p1]+array[p2];
            if(num == sum){
                int t = array[p1]*array[p2];
                if(t < muti ){
                    muti =t;
                    a = array[p1];
                    b = array[p2];
                }
                p1++;
                p2--;
            }
            else if(num > sum ){
                p2--;
            }
            else if( num <sum){
                p1++;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if( a== -1 && b == -1){
            return arrayList;
        }
        arrayList.add(a);
        arrayList.add(b);
        return arrayList;
    }
}
