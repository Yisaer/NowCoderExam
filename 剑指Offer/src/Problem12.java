import java.util.ArrayList;

/**
 * Created by Yisa on 2017/4/10.
 */
public class Problem12 {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for(int i = 0;i<array.length;i++){
            if(array[i] %2 == 0){
                arrayList2.add(array[i]);
            }
            else{
                arrayList1.add(array[i]);
            }
        }
        int i = 0;
        for(Integer integer : arrayList1){
            array[i] = integer;
            i++;
        }
        for(Integer integer : arrayList2){
            array[i] = integer;
            i++;
        }
    }
}
