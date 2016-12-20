#include <iostream>
#include <cmath>
using namespace std;

int main() {


    int rd;
    cin>>rd;
    int count = 0;
    for(int i=1;i*i<=rd;i++){
        int i2 = i*i;
        int y =(int)sqrt(rd-i2);
        if(y*y +i2 ==rd){
            count++;
        }
    }
    cout<<count*4<<endl;
    return 0;
}