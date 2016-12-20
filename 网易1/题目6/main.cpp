#include <iostream>
using namespace std;

long long Sum(long long x){
    if(x==1){
        return 1;
    }
    if(x %2 ==0){
        return Sum(x/2)+ x*(x/2)/2;
    }
    else{
        return Sum(x/2)+(x+1)*((x-1)/2+1)/2;
    }
}


int main() {
    long long n;
    cin>>n;

    cout<<Sum(n)<<endl;

    return 0;
}