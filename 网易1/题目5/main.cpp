#include <iostream>
using namespace std;
int rev(int x){
    int res = 0;
    while(x!=0){
        int val = x%10;
        x/=10;
        res = res*10+val;
    }
    return res;
}

int main() {
    int x,y;
    cin>>x>>y;
    cout<<rev(rev(x)+rev(y))<<endl;
}