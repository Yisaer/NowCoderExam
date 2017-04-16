import java.util.ArrayList;

/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem40 {
    private int max(int a,int b){
        if(a>=b){
            return a;
        }
        else
            return b;
    }
    private int min(int a,int b){
        if(a<=b){
            return a;
        }
        else
            return b;
    }
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        if(sum < 3){
            return arrayLists;
        }
        int s = (int)Math.sqrt(sum*2);
        for(int i  = s ; i >=2 ; i--){
//            System.out.println("i = " +i);
            if( (2*sum) % i == 0){
                int k = (2*sum)/i;
//                System.out.println("i = "+i+", k = "+k);
                int y1 = i%2;
                int y2 = k%2;
                if((y1==0&&y2==1)||(y1==1&&y2==0)){
                    int Max = max(i,k);
                    int Min = min(i,k);
                    int an = (Max+Min-1)/2;
                    int a1 = (Max-Min+1)/2;
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    for(int  j =a1;j<=an;j++){
                        tmp.add(j);
                    }
                    arrayLists.add(tmp);
                }
            }
        }

        return arrayLists;
    }

    public ArrayList<ArrayList<Integer> > FindContinuousSequence2(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        if(sum < 3){
            return arrayLists;
        }
        int left = 1;
        int right = 2;
        int s = (1+sum)/2;
        int curSum = 3;
        while(left<s){
            if(curSum < sum){
                right++;
                curSum+=right;
            }
            else if(curSum > sum){
                curSum-=left;
                left++;
            }
            else if( curSum == sum){
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for(int i =left ; i<=right;i++){
                    arrayList.add(i);
                }
                arrayLists.add(arrayList);
                curSum -= left;
                left++;
                right++;
                curSum+=right;
            }
        }


        return arrayLists;
    }
}
