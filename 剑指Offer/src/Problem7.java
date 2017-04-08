/**
 * Created by Yisa on 2017/4/8.
 */
public class Problem7  {
    boolean isPre = false;
    int[] Fib = new int[40];
    void init(){
        Fib[1] = 1;
        Fib[2] = 1;
        for(int i = 3;i<=39;i++){
            Fib[i] = Fib[i-1]+Fib[i-2];
        }
        isPre = true;
    }
    public int Fibonacci(int n) {
        if(isPre){
            return Fib[n];
        }
        else{
            init();
            return Fib[n];
        }
    }
}
