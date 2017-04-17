/**
 * Created by Yisa on 2017/4/17.
 */
public class Problem42 {
    public String LeftRotateString(String str,int n) {
        if(str.equals("") ){
            return "";
        }
        int len  = str.length();
        int rotate = n%len;
        String s1 = str.substring(rotate);
        String s2 = str.substring(0,rotate);
        return s1+s2;
    }
}
