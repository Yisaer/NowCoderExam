/**
 * Created by Yisa on 2017/4/12.
 */

public class Problem22 {

    public boolean verify(int [] seq ,int start,int end){
        if( end - start <=1 ){
            return true;
        }
        int left = 0;
        int right = 0;
        boolean isFind = false;
        for(int i = end-1 ; i>=start ;i --){
            if(seq[i] < seq[end]){
                left = i;
                right = i+1;
                isFind = true;
                break;
            }
        }
        if(!isFind){
            for(int i  =start ; i<end;i++){
                if(seq[i] < seq[end]){
                    return false;
                }
            }
            return verify(seq,start,end-1);
        }
        boolean islegal = true;
        for(int i = start ; i<=left;i++){
            if(seq[i] > seq[end]){
                islegal = false;
                break;
            }
        }

        if(islegal){
            if( right == end){
                return verify(seq,start,end-1);
            }

            for(int i = right; i<end ;i ++){
                if(seq[i] < seq[end]){
                    islegal =false;
                    break;
                }
            }
        }
        return islegal && verify(seq,start,left) && verify(seq,right,end-1);
    }

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        return  verify(sequence,0,sequence.length-1);
    }
}
