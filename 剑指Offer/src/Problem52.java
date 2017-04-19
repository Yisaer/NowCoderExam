/**
 * Created by Yisa on 2017/4/19.
 */
public class Problem52 {

    private boolean isNum(char ch){
        if(ch >='0'&&ch<='9'){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean isLegal(char ch){
        if(isNum(ch) == true){
            return true;
        }
        if(ch == 'e' || ch =='E' || ch == '.'||ch=='+'||ch=='-'){
            return true;
        }
        return false;
    }
    public boolean isNumeric(char[] str) {
        if((str[0] == '+'||str[0] =='-')){
            if(str.length==1){
                return false;
            }
        }
        else{
            if(str[0]<'0' ||str[0] >'9'){
                return false;
            }
        }

        boolean NumberEx = false;
        boolean isHadE = false;
        boolean isDot = false;
        for(int i  =1;i< str.length;i++){
            if(isLegal(str[i]) == false){
                return false;
            }
            if(isNum(str[i])== true){
                continue;
            }
            if(str[i] == 'e' || str[i] == 'E'){
                if(isHadE == true){
                    return false;
                }
                isHadE = true;
                if(isNum(str[i-1]) == false){
                    return false;
                }
                if(i == str.length-1){
                    return false;
                }
                continue;
            }
            if(str[i] == '.'){

                if(isHadE == true  || isDot == true){
                    return false;
                }
                isDot = true;
                if(isNum(str[i-1]) == false&&str[i-1]!='+'&&str[i-1]!='-'){
                    return false;
                }
                if(i == str.length-1){
                    return false;
                }
                continue;
            }
            if(str[i] == '+' || str[i] =='-'){
                if(i == str.length-1){
                    return false;
                }
                if(str[i-1] != 'e'&& str[i-1] !='E'){
                    return false;
                }
                if(isNum(str[i+1]) == false){
                    return false;
                }
                continue;
            }

        }
        return true;
    }
}
