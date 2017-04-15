/**
 * Created by Yisa on 2017/4/15.
 */
public class Problem29 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = 0;
        int res = 0;
        boolean isFind = false;
        for(int  i = 0 ; i< array.length;i++){
            sum+=array[i];
            if( sum < 0 ){
                sum = 0;
            }
            else{
                isFind = true;
                if( sum > res ){
                    res = sum;
                }
            }
        }
        if(isFind == false && res == 0){
            int Max = array[0];
            for(int  i =1;i<array.length;i++){
                if( array[i] > Max ){
                    Max = array[i];
                }
            }
            return Max;
        }
        return res;
    }
}
