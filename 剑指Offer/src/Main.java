import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Problem36 problem36 = new Problem36();
        int[] arr  ={ 2,3 , 4,4,4,4,5,6};
        int num = problem36.GetNumberOfK(arr,4);
        System.out.println(num);
    }
}
