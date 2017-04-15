import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Yisa on 2017/4/15.
 */
public class Problem26 {

    private HashSet<String> result = new HashSet<String>();
    int[] vis ;
    private void dfs(char[] arr , int Index,String s){
        if(Index == vis.length){
            result.add(s);
            return;
        }
        for(int  i = 0 ;i< arr.length;i++){
            String tmp = s;
            if(vis[i] == 0 ){
                tmp += arr[i];
                vis[i] = 1;
                dfs(arr, Index+1,tmp);
                vis[i] = 0;
            }
        }
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if( str.isEmpty() || str == null){
            return arrayList;
        }
        char [] strc = str.toCharArray();
         vis = new int[str.length()];
        for(int i = 0; i < vis.length;i++){
            vis[i] = 0;
        }

        dfs(strc,0,"");
        arrayList.addAll(result);
        Collections.sort(arrayList);
        return arrayList;
    }
}
