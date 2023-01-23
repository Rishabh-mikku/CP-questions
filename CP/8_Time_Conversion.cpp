#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    getline(cin,s);
    string s1=s.substr(8, s.length());
    // cout<<s1<<endl;
    if(s1=="AM"){
        string s2=s.substr(0,2);
        // cout<<s2<<endl;
        if(s2=="12")
        cout<<"00"<<""<<s.substr(2,6)<<endl;
        else
        cout<<s.substr(0,8)<<endl;
    }
    else if(s1=="PM"){
        string s2=s.substr(0,2);
        if(s2=="12")
        cout<<s.substr(0,8)<<endl;
        else
        {
            int a=stoi(s2);
            a=a+12;
            string s3=to_string(a);
            cout<<s3<<""<<s.substr(2,6)<<endl;
        }
    }
}