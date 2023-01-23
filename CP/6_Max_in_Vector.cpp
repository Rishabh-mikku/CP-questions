#include<bits/stdc++.h>
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
    int max=*max_element(a.begin(),a.end());
    int count=0;
    for(int i=0;i<a.size();i++){
        if(a[i]==max)
        count++;
    }
    cout<<count<<endl;
}