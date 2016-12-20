#include <iostream>
using namespace std;
#include <cstring>
long long  dp[32][2];
int main() {

    memset(dp,0,sizeof(dp));
    dp[1][0]=3;
    dp[1][1]=0;
    dp[2][0]=3;
    dp[2][1]=6;
    for(int i = 3;i<=30;i++){
        dp[i][0] = dp[i-1][0]+dp[i-1][1];
        dp[i][1] = dp[i-1][0]*2+dp[i-1][1];
    }
    int n;
    cin>>n;
    cout<<dp[n][0]+dp[n][1]<<endl;


    return 0;
}

