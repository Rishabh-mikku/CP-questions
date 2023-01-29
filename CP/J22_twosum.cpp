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
    int flag=0;
    for(int i=0;i<a.size();i++){
        for(int j=0;j<a.size();j++){
            if(i!=j){
                if(a[i]+a[j]==target_sum && flag==0){
                cout<<i<<" "<<j<<endl;
                flag=1;
                break;
                }
            }
        }
    }
}