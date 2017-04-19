/**
 * Created by Yisa on 2017/4/19.
 */
public class Problem48 {
    public int StrToInt(String str) {
        if (str.equals("0") || str.equals("")|| str == null) {
            return 0 ;
        }
        int sum = 0;
        int start = 0;
        char[] chars = str.toCharArray();
        if(chars[0]=='+'){
            start=1;
        }
        boolean isNe = false;
        if(chars[0] == '-'){
            start = 1;
            isNe = true;
        }
        for(int i = start;i<chars.length;i++){
            if(chars[i] >='0' && chars[i] <='9'){
                sum = sum*10 + (chars[i] - '0');
            }
            else{
                return 0;
            }
        }
        if(isNe == true){
            sum = -sum;
        }
        return sum;
    }
}
