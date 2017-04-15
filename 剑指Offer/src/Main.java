import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Problem27 problem27 = new Problem27();
        int[] array = {4,2,3,2,4,2,5,2,3};

        Problem28 problem28 = new Problem28();
        int a  = problem27.partition(array);
        System.out.println("a = "+a);
    }
}
