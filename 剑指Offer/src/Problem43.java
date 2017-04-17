/**
 * Created by Yisa on 2017/4/17.
 */
public class Problem43 {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }
        String[] s = str.split(" ");
        String res = "";
        for(int i = s.length-1;i >=0;i--){
            if(i<s.length-1){
                res+=" ";
            }
            res+=s[i];
        }
        return res;
    }
}
