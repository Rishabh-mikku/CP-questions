#include <bits/stdc++.h>
using namespace std;

int main(){
    long long t;
    cin>>t;
    long long n,x;
    
    while(t-- >0){
        cin>>n;
        vector<long long>v;
        map<long long, long long>m;
        for(long long i=0;i<n;i++){
            cin>>x;
            v.push_back(x);
        }

        sort(v.begin(), v.end(), greater<>());

        // for(int i=0;i<v.size();i++)
        //     cout<<v[i]<<" ";

        int temp = 1;
        for(long long i=0;i<n;i++)
            m[v[i]]++;

        for(auto it:m){
            if(it.second%2){
                temp=0;
                break;
            }
        }

        if(temp==1)
            cout<<"Zenyk"<<endl;
        else
            cout<<"Marichka"<<endl;
    }
}