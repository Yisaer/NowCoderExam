/**
 * Created by Yisa on 2017/4/19.
 */
public class Problem51 {

    private boolean FunMatch(char[] str, int strIndex,char[] pattern,int patternIndex){

        //同时匹配到结束
        if(strIndex == str.length && patternIndex == pattern.length){
            return true;
        }
        //字符串未匹配完,模式串已经匹配完
        if(patternIndex == pattern.length && str.length !=strIndex){
            return false;
        }

        // 当模式串未匹配完,且第二位是'*'时
        if(patternIndex +1 < pattern.length && pattern[patternIndex+1] =='*'){

            //第一位可以匹配,三种策略
            if((strIndex!=str.length && pattern[patternIndex] == str[strIndex])
                    || (pattern[patternIndex] =='.' && strIndex != str.length))
            {
                // 策略一:当0次处理 策略二:当一次处理 策略三:当多次处理
                return FunMatch(str,strIndex,pattern,patternIndex+2)
                        || FunMatch(str,strIndex+1,pattern ,patternIndex+2)
                        || FunMatch(str,strIndex+1,pattern,patternIndex);
            }
            else{
                //第一位未匹配时, 当0次处理
                return FunMatch(str,strIndex,pattern,patternIndex+2);
            }
        }
        // 第一位匹配,第二位没有*
        if ((strIndex != str.length && pattern[patternIndex]== str[strIndex]) ||(pattern[patternIndex] == '.' &&strIndex!=str.length)){
            return FunMatch(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;
    }

    public boolean match(char[] str, char[] pattern)
    {
        if(str == null || pattern == null){
            return false;
        }

        int strIndex = 0;
        int patternIndex = 0;
        return FunMatch(str,strIndex,pattern,patternIndex);
    }
}
