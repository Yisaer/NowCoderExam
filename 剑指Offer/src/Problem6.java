/**
 * Created by Yisa on 2017/4/8.
 */


public class Problem6 {
    public int minNumberInRotateArray(int [] array) {
        int index = 0;
        if( array.length == 0){
            return 0 ;
        }
        int p1 = 0;
        int p2 = array.length-1;
        for( ; p1<p2 ; ){
            if(array[p1]>array[p1+1]){
                return array[p1+1];
            }
            else if(array[p2] < array[p2-1]){
                return array[p2];
            }
            p1++;
            p2--;
        }
        return array[p1];
    }
}
