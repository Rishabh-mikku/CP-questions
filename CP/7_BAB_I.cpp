#include<bits/stdc++.h>
using namespace std;

int main(){
    long long t;
    cin>>t;
    long long n;
    while(t-- >0){
        cin>>n;
        vector<long long> a;
        long long x;
        for(long long i=0;i<n;i++){
            cin>>x;
            a.push_back(x);
        }
        long long max_e=INT_MAX;
        long long min_e=a[0];
        for(int i=0;i<a.size();i++)
        if(a[i]>0 && a[i]<min_e)
        min_e=a[i];

        for(int i=0;i<a.size();i++)
        if(a[i]<0 && a[i]>max_e)
        max_e=a[i];

        long long result=min(min_e,abs(max_e));
        cout<<result-1<<endl;
    }
}