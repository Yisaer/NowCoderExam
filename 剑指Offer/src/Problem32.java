/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem32 {
    public int GetUglyNumber_Solution(int index) {
        int[] F = new int[1000];
        F[0] =1;
        if(index <= 0 ){
            return 0 ;
        }
        if(index == 1){
            return F[0];
        }

        int t2 =0 ,t3=0, t5 = 0;
        for(int i  = 1 ;i<index;i++){
            F[i] = min(F[t2]*2,min(F[t3]*3,F[t5]*5));
            if(F[i] == F[t2]*2) t2++;
            if(F[i] == F[t3]*3) t3++;
            if(F[i] == F[t5]*5) t5++;
        }
        return F[index-1];
    }

    private int min(int a,int b){
        if( a<= b){
            return a;
        }
        else{
            return b;
        }
    }
}


