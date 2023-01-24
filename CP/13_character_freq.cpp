#include <bits/stdc++.h>
using namespace std;

int main(){
    string str="rishabh";
    map<char, int> freq;
    for(int i=0;i<str.length();i++){
        freq[str[i]]++;
    }
    map<char,int>::iterator it=freq.begin();
    for(;it!=freq.end();it++)
    cout<<it->first<<" "<<it->second<<endl;
}