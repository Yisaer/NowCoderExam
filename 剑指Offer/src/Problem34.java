/**
 * Created by Yisa on 2017/4/16.
 */
public class Problem34 {

    private int ans =  0;
    private int[] arr;
    private int[] tmp;
    private int mod = 1000000007;

    private void Merge(int l,int mid ,int r){
        int i = l ;
        int j = mid+1;
        int k = l;
        while( i<=mid && j<= r){
            if(arr[i] > arr[j]){
                tmp[k++] = arr[j++];
                ans = (((mid-i+1)%mod)+ans)%mod;
            }
            else{
                tmp[k++] = arr[i++];
            }
        }
        while(i<=mid) tmp[k++] = arr[i++];
        while(j<=r) tmp[k++] = arr[j++];
        for(int t = l ; t<=r;t++){
            arr[t] = tmp[t];
        }
    }
    private void Merge_sort(int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            Merge_sort(l,mid);
            Merge_sort(mid+1,r);
            Merge(l,mid,r);
        }
    }
    public int InversePairs(int [] array) {
        arr = array;
        tmp = new int[array.length];
        Merge_sort(0,array.length-1);
        return ans;
    }
}
