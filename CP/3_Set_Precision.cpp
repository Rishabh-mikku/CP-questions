#include<bits/stdc++.h>
#include<iomanip>
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
    double count_positive=0,count_zero=0,count_negative=0;
    for(int i=0;i<a.size();i++){
        if(a[i]>0)
        count_positive++;
        if(a[i]<0)
        count_negative++;
        if(a[i]==0)
        count_zero++;
    }
    double positive=(double)count_positive/n;
    double negative=(double)count_negative/n;
    double zero=(double)count_zero/n;
    cout<<setprecision(6)<<positive<<endl;
    cout<<setprecision(6)<<negative<<endl;
    cout<<setprecision(6)<<zero<<endl;
}