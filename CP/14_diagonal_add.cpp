#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    vector<vector<int>> a;
    int x;
    for(int i=0;i<n;i++){
        vector<int> row;
        for(int j=0;j<n;j++){
        cin>>x;
        row.push_back(x);
        }
        a.push_back(row);
        row.clear();
    }
    int sum_left_diagonal=0, sum_right_diagonal=0;
    for(int i=0;i<a.size();i++){
        for(int j=0;j<a[i].size();j++){
            if(i==j)
            sum_left_diagonal+=a[i][j];
            if(i+j==n-1)
            sum_right_diagonal+=a[i][j];
        }
    }
    cout<<sum_left_diagonal<<" "<<sum_right_diagonal<<endl;
}