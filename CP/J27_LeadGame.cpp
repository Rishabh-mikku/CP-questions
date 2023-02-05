#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    int a[n][2];
    for(int i=0;i<n;i++){
        for(int j=0;j<2;j++)
        cin>>a[i][j];
    }

    // For displaying
    // cout<<endl;
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<2;j++)
    //     cout<<a[i][j]<<" ";
    //     cout<<endl;
    // }

    int max=0, max_lead_player;
    for(int i=0;i<n;i++){
        if(a[i][0]>a[i][1]){
            if(max<a[i][0] - a[i][1]){
                max = a[i][0] - a[i][1];
                max_lead_player=1;
            } 
        }
        else if(a[i][0]<a[i][1]){
            if(max<a[i][1] - a[i][0]){
                max = a[i][1] - a[i][0];
                max_lead_player=2;
            }
        }
    }

    cout<<max_lead_player<<" "<<max<<endl;
}