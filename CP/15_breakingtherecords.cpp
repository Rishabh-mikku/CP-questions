#include <bits/stdc++.h>
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
    int min_count=0,max_count=0,min=a[0],max=a[0];
    for(int i=0;i<a.size();i++){
        if(a[i]<min){
        min_count++;
        min=a[i];
        }
        if(a[i]>max){
        max_count++;
        max=a[i];
        }
    }
    cout<<max_count<<" "<<min_count<<endl;
}