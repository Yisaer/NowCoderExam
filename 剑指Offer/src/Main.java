import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Problem18 problem18 = new Problem18();
        int [][] array  = {
                {1},{2},{3},{4},{5}
        };
        ArrayList<Integer> arrayList = problem18.printMatrix(array);
        for(Integer integer : arrayList){
            System.out.print(integer+",");
        }
    }
}
