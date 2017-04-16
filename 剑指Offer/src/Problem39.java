import java.util.ArrayList;

/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem39 {


    private int findFirstBitOne( int num){
        int Index = 0;
        while( (num&1)== 0&&Index<32){
            num = num >>1;
            Index++;
        }
        return Index ;
    }

    private boolean isIndexBitOne(int num,int Index){
        num = num>>Index;
        return (num&1)==1;
    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int tmp = 0;
        for(int i =  0 ; i<array.length;i++){
            tmp ^= array[i];
        }
        if(tmp == 0 ){
            return;
        }
        int Index = findFirstBitOne(tmp);
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for(int i = 0 ; i<array.length;i++){
            if(isIndexBitOne(array[i],Index)){
                arrayList1.add(array[i]);
            }
            else{
                arrayList2.add(array[i]);
            }
        }
        int t1 = 0;
        for(Integer a :arrayList1){
            t1^=a;
        }
        int t2 = 0;
        for(Integer a: arrayList2){
            t2^=a;
        }
        num1[0] =t1;
        num2[0] =t2;
    }
}
