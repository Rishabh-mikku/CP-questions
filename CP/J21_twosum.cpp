#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    int x;
    vector<int> a;
    for(int i=0;i<n;i++){
        cin>>x;
        a.push_back(x);
    }
    int target_sum;
    cin>>target_sum;
    vector<int> b;
    for(int i=0;i<a.size()-1;i++)
    b.push_back(a[i]+a[i+1]);
    int flag=0;
    for(int i=0;i<b.size();i++){
        if(b[i]==target_sum){
            cout<<i<<" "<<i+1<<endl;
            flag=1;
            break;
        }
    }
    if(flag==0)
    cout<<"-1"<<endl;
}