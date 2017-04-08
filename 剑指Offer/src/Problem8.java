/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem8 {
    int[] F = new int[99999];
    private void init(){
        F[1] = 1;
        F[2] = 2;
        for(int i =3;i<99999;i++){
            F[i] = F[i-2]+F[i-1];
        }
    }
    public int JumpFloor(int target) {
        init();
        return F[target];
    }
}
