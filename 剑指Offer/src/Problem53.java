import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yisa on 2017/4/19.
 */
public class Problem53 {

    int[] Cnt = new int[128];
    StringBuffer stringBuffer = new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        int num = ch -'\0';
        if(Cnt[num] == 0 ){
            Cnt[num] = 1;
        }
        else{
            Cnt[num] ++;
        }
        stringBuffer.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char ch : stringBuffer.toString().toCharArray()){
            int num = ch -'\0';
            if(Cnt[num] == 1){
                return ch;
            }
        }
        return '#';
    }
}
