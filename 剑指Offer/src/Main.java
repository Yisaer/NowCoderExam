import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Problem20 problem20 = new Problem20();
        int[] a = { 1,2,3,4};
        int[] b = {4,3,2,1 };
        boolean  p = problem20.IsPopOrder(a,b);
        if(p){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
