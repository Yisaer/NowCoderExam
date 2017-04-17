/**
 * Created by Yisa on 2017/4/17.
 */
public class Problem44 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5){
            return false;
        }
        boolean[] vis = new boolean[14];
        for(int i = 0 ; i<vis.length;i++){
            vis[i] = false;
        }
        int max = -1;
        int min = 14;
        int  count = 0 ;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]  == 0 ){
                count++;
                continue;
            }
            if(numbers[i]>13 || numbers[i] < 0 ){
                return false;
            }
            if(min> numbers[i] ){
                min = numbers[i];
            }
            if(max < numbers[i]){
                max = numbers[i];
            }
            if(vis[numbers[i]] == false){
                vis[numbers[i]] = true;
            }
            else  if(vis[numbers[i]] == true){
                return false;
            }
        }
        if(max - min>=5 ){
            return false;
        }
        for(int i =  min;i<=max;i++){
            if(vis[i] == false){
                count -- ;
                if(count < 0){
                    return false;
                }
            }
        }
        return true;
    }
}
