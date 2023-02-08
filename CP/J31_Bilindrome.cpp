#include <bits/stdc++.h>
using namespace std;

void solve(long long n, string s){
    unordered_set<char>se;
    int flag=0;
    for(long long i=0;i<n;i++){
        if(se.find(s[i])!=se.end()){
            flag=1;
            break;
        }
        se.insert(s[i]);
    }
    if(flag)
        cout<<n-2<<endl;
    else
        cout<<"-1"<<endl;
}
int main(){
    long long t;
    cin>>t;
    long long n;
    while(t-- >0){
        cin>>n;
        string s;
        cin>>s;
        solve(n, s);
    }
}