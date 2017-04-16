/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem36 {
    public int GetNumberOfK(int [] array , int k) {
        int low = 0;
        int high = array.length-1;
        int Index1 = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(array[mid] == k){
                if(mid == 0 || array[mid-1] < k){
                    Index1 = mid;
                    break;
                }
                if(array[mid-1]==k){
                    high = mid-1;
                    continue;
                }
            }
            if(array[mid] < k){
                low = mid+1;
                continue;
            }
            if(array[mid] > k ){
                high = mid-1;
                continue;
            }
        }
        if(Index1 == -1){
            return 0 ;
        }
        int Index2 = -1;
        low = Index1;
        high = array.length-1;
        while(low <= high){
            int mid = (high+low)/2;
            if(array[mid] == k){
                if(mid == array.length-1 || array[mid+1] > k){
                    Index2 = mid;
                    break;
                }
                if(array[mid+1]==k){
                    low = mid+1;
                }
            }
            if(array[mid] > k){
                high = mid-1;
            }
        }
        return Index2-Index1+1;
    }
}
