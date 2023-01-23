#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    vector<int> a;
    map<int, int> freq;
    int x;
    for(int i=0;i<n;i++){
        cin>>x;
        a.push_back(x);
    }
    for(int i=0;i<a.size();i++){
        freq[a[i]]++;
    }
    map<int, int>::iterator it=freq.begin();
    for(;it!=freq.end();it++)
    cout<<it->first<<" "<<it->second<<endl;
}