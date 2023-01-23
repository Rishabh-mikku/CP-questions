#include<bits/stdc++.h>
using namespace std;

int main(){
    vector<int> a;
    int x;
    for(int i=0;i<5;i++){
        cin>>x;
        a.push_back(x);
    }
    sort(a.begin(),a.end());
    int sum_minimum=0,sum_maximum=0;
    for(int i=0;i<4;i++)
    sum_minimum+=a[i];
    for(int i=1;i<a.size();i++)
    sum_maximum+=a[i];
    cout<<sum_minimum<<" "<<sum_maximum<<endl;
}