#include <iostream>
using namespace std;
#include<cstring>
#include <cmath>
#include <vector>
int n,m;

int dp[100001];
int const INF = 0x3f3f3f3f;
vector<int> y;
void Yue(int val){
    y.clear();
    for(int i = 2;i<=sqrt(val);i++){
        if(val % i ==0) {
            y.push_back(i);
            if(val/i !=i){
                y.push_back(val/i);
            }
        }
    }
}

int main() {
    cin>>n>>m;
    memset(dp,INF,sizeof(dp));
    dp[n] = 0;
    for(int i=n;i<=m-2;i++){
        if(dp[i]!=INF){
           Yue(i);
            vector<int>::iterator it;

            for(it=y.begin();it!=y.end();it++){
                if(*it+i<=m){
                    dp[*it+i] = min(dp[*it+i],dp[i]+1);

                }
            }
        }
    }
    if(dp[m] !=INF)
    cout<<dp[m]<<endl;
    else
        cout<<-1<<endl;

    return 0;
}