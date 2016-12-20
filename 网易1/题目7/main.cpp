#include <iostream>
using namespace std;
int dp[52];
int const INF = 0x3f3f3f3f;
#include <cstring>



int main() {
    int w[3];
    int v[3];
    w[1]=3;
    w[2]=4;
    v[1]=-1;
    v[2]= -1;
    int n;
    cin>>n;
    if(n%2==1){
        cout<<-1<<endl;
        return 0 ;
    }
    n/=2;
    memset(dp,-INF,sizeof(dp));
    dp[0] = 0;
    for(int i = 1;i<=50;i++){
        for(int j = 1;j<=2;j++){
            if(i-w[j]<0)
                continue;
            dp[i] = max(dp[i],dp[i-w[j]]+v[j]);
        }
    }
    if(dp[n]!=-INF)
        cout<<-dp[n]<<endl;
    else
        cout<<-1<<endl;

    return 0;
}