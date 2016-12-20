#include <iostream>
using namespace std;
double const eps = 1e-6;
#include <cmath>

int main() {

   int q,w,e,r;
   cin>>q>>w>>e>>r;
    double a = (q+e)/2.0;
    double b= (w+r)/2.0;
    double c = r-b;
    if( abs(a-int(a))>=eps ||abs(b-int(b))>=eps||abs(c-int(c))>=eps ){
        cout<<"No"<<endl;
        return  0 ;
    }
    if(abs(a-b-q)>=eps || abs(b-c-w)>=eps || abs(a+b-e)>=eps || abs(b+c-r)>=eps){
        cout<<"No"<<endl;
        return 0 ;
    }

    cout<<a<<" "<<b<<" "<<c<<endl;

    return 0;
}