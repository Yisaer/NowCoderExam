/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem2 {
    public String replaceSpace(StringBuffer str) {
        int num = 0 ;
        for(int i  =0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                num++;
            }
        }
        int len1 = str.length();
        int len2 = len1 + 2*num;
        int ptr1 = len1-1;
        int ptr2 = len2-1;
        str.setLength(len2);
        for( ; ptr1>=0&& ptr1 <ptr2; ptr1 -- ){
            if(str.charAt(ptr1) == ' '){
                str.setCharAt(ptr2--,'0');
                str.setCharAt(ptr2--,'2');
                str.setCharAt(ptr2--,'%');
            }
            else{
                str.setCharAt(ptr2--,str.charAt(ptr1));
            }
        }
        return str.toString();
    }
}