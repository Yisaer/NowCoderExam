import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Problem52 problem52 = new Problem52();
        char[] s = "12e".toCharArray();
        boolean flag = problem52.isNumeric(s);
        if(flag == true){
            System.out.println("t");
        }
        else{
            System.out.println("false");
        }
    }
}
