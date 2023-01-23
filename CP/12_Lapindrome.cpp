#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    string s;
    while(t-- >0){
        // getline(cin,s);
        cin>>s;
        int n=s.length();
        vector<char> v1;
        vector<char> v2;
        for(int i=0;i<n/2;i++)
        v1.push_back(s[i]);
        if(n%2==1){

        for(int i=(n/2)+1;i<n;i++)
        v2.push_back(s[i]);
        }
        else{
        for(int i=n/2;i<n;i++)
        v2.push_back(s[i]);
        }
        sort(v1.begin(),v1.end());
        sort(v2.begin(),v2.end());
        int flag=0;
        for(int i=0;i<v1.size();i++){
            if(v1[i]!=v2[i])
            {
                flag=1;
                cout<<"NO"<<endl;
                break;
            }
        }
        if(flag==0)
        cout<<"YES"<<endl;
    }
}