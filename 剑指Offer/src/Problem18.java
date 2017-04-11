
import java.util.ArrayList;

/**
 * Created by Yisa on 2017/4/11.
 */
public class Problem18 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        PrintArray(arrayList,matrix,
                0,matrix.length-1,
                0,matrix[0].length-1);

        return arrayList;
    }

    public void PrintArray(ArrayList<Integer> arrayList , int [][]array ,
                           int rowStart,int rowEnd ,
                           int colStart, int colEnd){
//        System.out.println("rowStart = "+rowStart +", rowEnd = "+rowEnd+", colStart = "+colStart +",colEnd = "+colEnd);
        for(int i = colStart;i<=colEnd;i++){
            arrayList.add(array[rowStart][i]);
        }
        for(int i  =rowStart+1 ;i<=rowEnd;i++){
            arrayList.add(array[i][colEnd]);
        }
        if(rowStart != rowEnd){
            for(int i = colEnd -1 ;i>=colStart;i--){
                arrayList.add(array[rowEnd][i]);
            }
        }
        if(colStart!= colEnd){
            for(int i = rowEnd-1;i>=rowStart+1;i--){
                arrayList.add(array[i][colStart]);
            }
        }

        int NewRowStart = rowStart+1;
        int NewRowEnd = rowEnd-1;
        int NewColStart = colStart+1;
        int NewColEnd = colEnd-1;
//        System.out.println("NewrowStart = "+NewRowStart +", NewrowEnd = "+NewRowEnd+", NewcolStart = "+NewColStart +",NewcolEnd = "+NewColEnd);
        if(NewRowStart > NewRowEnd || NewColStart > NewColEnd ){
            return;
        }
//        System.out.println("here");
        PrintArray(arrayList,array,rowStart+1,rowEnd-1,colStart+1,colEnd-1);
    }


}

// 1  2  3  4
// 5  6  7  8
// 9 10 11 12
//13 14 15 16

////        1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
//          1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10,
////        1,2,3,4,8,12,16,15,14,13,9,5,1,6,7,11,10,6,
//
//1 2 3 4 5
//1
//2
//3
//4
//5
//    0,4
//            1,0,0
//1
//2
//3
//4
//5
