/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem1 {
    public boolean Find(int target, int [][] array) {
        if( array == null){
            return false;
        }
        int row = 0 ;
        int col = array[0].length-1;
        while ( row <array.length && col >= 0 ){
            if(array[row][col] == target){
                return true;
            }
            else if( array[row][col] > target ){
                 col -- ;
            }
            else if(array[row][col] < target ){
                row ++ ;
            }
        }
        return false;
    }





    public boolean Find2(int target ,int [][]array){
        int curlow = 0;
        int curhigh = array[0].length-1;
        for(int i  =0; i<array.length;i++){
            int low = curlow;
            int high = curhigh;
            int mid = 0;
            while(low <=high){
                mid = (low+high)/2;
                if( target >array[i][mid]){
                    low = mid +1;
                }
                else if( target < array[i][mid]){
                    high = mid - 1;
                }
                else{
                    return true;
                }
            }
            if( i+1 <array.length){
                if(array[i][mid] > target){
                    curhigh = curhigh-1;
                }
                else{
                    curhigh = array[i+1].length-1;
                }
            }

        }
        return false;
    }
}


