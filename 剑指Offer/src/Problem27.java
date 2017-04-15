/**
 * Created by Yisa on 2017/4/15.
 */
public class Problem27 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 1;
        int num = array[0];
        for(int i = 1;i< array.length;i++){
            if(count == 0){
                num = array[i];
                count++;
            }
            else{
                if(num == array[i]){
                    count++;
                }
                else{
                    count -- ;
                }
            }
        }
        count = 0;
        for(int i = 0 ;i<array.length;i++){
            if(array[i] == num ){
                count++;
            }
        }
        if( count <= array.length/2){
            return  0 ;
        }
       return num;
    }

    private  void swap(int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

   public int Partition(int[] arr,int start ,int end){
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

    public int MoreThanHalfNum_Solution2(int [] array) {
        if( array.length == 0){
            return 0;
        }
        int len = array.length;
        int middle = len/2;
        int start = 0;
        int end = len -1;
        int Index = Partition(array,start,end);
        while(Index != middle){
            if( Index > middle ){
                end = Index -1 ;
                Index = Partition(array,start,end);
            }
            else{
                start = Index+1;
                Index = Partition(array,start,end);
            }
        }
        int result = array[middle];

        int count = 0;
        for(int i = 0 ;i<array.length;i++){
            if(array[i] == result ){
                count++;
            }
        }
        if( count <= array.length/2){
            return  0 ;
        }
        return result;
    }
}
