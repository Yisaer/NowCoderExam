/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem9 {
    private boolean I = false;
    private int[] F = new int[999];
    private  void init(){
        I = true;
        F[1] = 1;
        for(int i  = 2;i<999;i++){
            F[i] = 1;
            for(int  j =1;j<i;j++){
                F[i]+=F[j];
            }
        }
    }
    public int JumpFloorII(int target) {
        if(!I){
            init();
        }
        return F[target];
    }
}
