#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin>>s;
    int i=0, j=s.size()-1;
    bool isPalindrome=true;

    while(i<=j){
        if(s[i]!=s[j]) isPalindrome=false;
        if(s[i]==s[j]) isPalindrome=true;
        i++;
        j--;
    }

    if(isPalindrome)
        cout<<"1"<<endl;
    else
        cout<<"-1"<<endl;


}