/**
 * Created by Yisa on 2017/4/19.
 */
public class Problem50 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if(A.length == 0){
            return B;
        }
        if(A.length == 1){
            B[0] = 1;
            return B;
        }
        int[] For = new int[A.length];
        int[] Rev = new int[A.length];
        for(int i = 0 ;i<A.length;i++){
            if(i == 0){
                For[0] = A[0];
            }
            else{
                For[i] = For[i-1]*A[i];
            }
        }

        for(int i = A.length-1 ; i>=0; i --){
            if(i == A.length - 1){
                Rev[i] = A[i];
            }
            else{
                Rev[i] = Rev[i+1]*A[i];
            }
        }
        B[0] = Rev[1];
        B[A.length-1] = For[A.length-2];
        for(int i = 1;i<A.length-1;i++){
            B[i] = For[i-1]*Rev[i+1];
        }
        return B;
    }
}
