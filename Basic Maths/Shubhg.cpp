#include<bits/stdc++.h>
using namespace std;
void recursion(int n, string &str)
{
    if(n<26)
    {
        char ch = n+97;
        str+=ch;
        return ;
    }
    if(n>25 && n<100)
    {
        char ch = (n%10)+97;
        str+=ch;
        n/=10;
        ch = (n%10)+97;
        str+=ch;
        n/=10;
        return;
    }
    while(n>100)
    {
        recursion(n%100,str);
        n/=100;
    }
    recursion(n,str);
    return;
}
int main()
{
    cout<<"Enter the Number ";
    int n;
    cin>>n;
    string str;
    recursion(n,str);
    reverse(str.begin(),str.end());
    cout<<str;
}
