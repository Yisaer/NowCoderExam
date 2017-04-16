import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem31 {
    private long min =0;
    private boolean[] vis;
    private void dfs(int[] numbers,long cur,int Index){
        if(Index >= numbers.length){
            if(cur < min ){
                min = cur;
            }
            return ;
        }
        for(int i = 0 ; i<vis.length;i++){
            if(vis[i] == false){
                vis[i]  = true;
                int muti = 1;
                int a = numbers[i];
                while(a!=0){
                    muti*=10;
                    a/=10;
                }
                long num = cur * muti +numbers[i];
                dfs(numbers,num,Index+1);
                vis[i] = false;
            }
        }
    }

    private void go(int[] numbers){
        for(int  i = 0 ;i<numbers.length;i++){
            vis[i] = true;
            dfs(numbers,numbers[i],1);
            vis[i] = false;
        }
    }

    public String PrintMinNumber(int [] numbers) {

        if(numbers.length == 0){
            return "";
        }
        vis = new boolean[numbers.length];
        for(int i = 0; i<numbers.length;i++){
            if(i == 0){
                min += numbers[i];
            }
            else{
                int muti = 1;
                int a = numbers[i];
                while(a!=0){
                    muti*=10;
                    a/=10;
                }
                min  = min*muti +numbers[i];
            }
        }
        for(int i = 0 ;i <vis.length;i++){
            vis[i] = false;
        }
        go(numbers);
        return new Long(min).toString();
    }


    public String PrintMinNumber2(int[] array){
        if(array.length == 0){
            return "";
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i  = 0;i <array.length;i++){
            arrayList.add(new Integer(array[i]).toString());
        }
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s1.compareTo(s2);
            }
        });
        String res = "";
        for(String s : arrayList){
            res+=s;
        }
        return res;
    }

}
