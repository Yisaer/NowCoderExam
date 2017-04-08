/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem10 {
    private boolean I = false;
    private int[] F = new int[999];
    private  void init(){
        I = true;
        F[1] = 1;
        F[2] = 2;
        for(int  i =3;i<999;i++){
            F[i] = F[i-1]+F[i-2];
        }
    }
    public int RectCover(int target) {
        if(!I){
            init();
        }
        return F[target];
    }
}
