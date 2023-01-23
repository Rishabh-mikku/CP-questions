#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    vector<int> a;
    int x;
    for(int i=0;i<n;i++){
        cin>>x;
        a.push_back(x);
    }
    for(int i=0;i<a.size();i++){
        if(a[i]>=38){
        int m=a[i]%5;
        int d=5-m;
        if(d<3)
        a[i]+=d;
        }
    }
    for(int i=0;i<a.size();i++)
    cout<<a[i]<<endl;
}