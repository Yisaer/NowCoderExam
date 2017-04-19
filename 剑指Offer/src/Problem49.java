/**
 * Created by Yisa on 2017/4/19.
 */
public class Problem49 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int[] num = new int[length];
        if(length == 0 || numbers.length == 0){
            duplication[0] = -1;
            return false;
        }
        for(int i =  0 ;i<length;i++){
            num[i] = 0;
        }
        for(int i = 0;i<numbers.length;i++){
            int x = numbers[i];
            num[x] ++;
            if( num[x] >=2){
                duplication[0] = x;
                return true;
            }
        }
        duplication[0] = -1;
        return false;
    }
}
