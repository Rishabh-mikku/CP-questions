#include <bits/stdc++.h>
using namespace std;

int main(){
    int t; cin>>t;
    int n;
    while(t-- >0){
        cin>>n;
        for(int i=1;i<=n;i++){
            if(i==n)
                cout<<"1";
            else
                cout<<i+1<<" ";
        }
        cout<<endl;
    }
}