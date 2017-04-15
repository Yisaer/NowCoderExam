import java.util.ArrayList;

/**
 * Created by Yisa on 2017/4/15.
 */
public class Problem28 {
    private  void swap(int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int Partition(int[] arr,int start ,int end){
        int  i  = start -1;
        int tmp  = arr [end];
        for(int j = start ;j <end;j++){
            if( arr[j] <tmp){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,end);
        return i;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(k == 0 || k>input.length){
            return arrayList;
        }
        if( k == input.length){
            for(int i = 0 ; i<input.length;i++){
                arrayList.add(input[i]);
            }
            return arrayList;
        }
        int start = 0;
        int end = input.length-1;
        int Index = Partition(input , start,end);
        while(Index != k){
            if( Index > k ){
                end = Index -1 ;
                Index = Partition(input,start,end);
            }
            else{
                start = Index+1;
                Index = Partition(input,start,end);
            }
        }
        for(int i = 0;i<k;i++){
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}
