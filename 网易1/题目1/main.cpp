#include <iostream>
using namespace std;

int F[100];
int main() {

    int n;
    cin>>n;
    int count = 0;
    for(int i = 0;i<n;i++){
        cin>>F[i];
    }
    if(n==1){
        cout<<0<<endl;
        return 0 ;
    }
    int i = 0;
    int j = n-1;
    for( ;i<j;){
        if(F[i]==F[j]){
            i++;
            j--;
            continue;
        }
        if(F[i]!=F[j]){
            count++;
            if(F[i]<F[j]){
                F[i+1]+=F[i];
                i++;
            }
            else{
                F[j-1]+=F[j];
                j--;
            }
        }
    }
    cout<<count<<endl;
    return 0;
}