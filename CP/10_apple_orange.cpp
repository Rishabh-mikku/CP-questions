#include<bits/stdc++.h>
using namespace std;

int main(){
    int s,t,a,b,m,n;
    cin>>s>>t;
    cin>>a>>b;
    cin>>m>>n;
    vector<int> apple;
    vector<int> orange;
    int x;
    for(int i=0;i<m;i++){
        cin>>x;
        apple.push_back(x);
    }
    for(int i=0;i<n;i++){
        cin>>x;
        orange.push_back(x);
    }
    int apple_count=0,orange_count=0;
    for(int i=0;i<apple.size();i++){
        apple[i]=a+apple[i];
        if(apple[i]>=s && apple[i]<=t)
        apple_count++;
    }
    for(int i=0;i<orange.size();i++){
        orange[i]=b+orange[i];
        if(orange[i]>=s && orange[i]<=t)
        orange_count++;
    }
    cout<<apple_count<<"\n"<<orange_count<<endl;
    
}