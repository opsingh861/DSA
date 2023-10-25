#include <bits/stdc++.h>
using namespace std;
 

bool balance_check(string inp)
{

    stack<char> brack;
    for (int i = 0; i < inp.length(); i++) {
        if (brack.empty()) {
             
         
            brack.push(inp[i]);
        }
        else if ((brack.top() == '(' && inp[i] == ')')
                 || (brack.top() == '{' && inp[i] == '}')
                 || (brack.top() == '[' && inp[i] == ']')) {
             
         
            brack.pop();
        }
        else {
            brack.push(inp[i]);
        }
    }
    if (brack.empty()) {
         
        
        return true;
    }
    return false;
}
 

int main()
{
    string inp ;
    cin>>inp;
 
    
    if (balance_check(inp))
        cout << "Success";
    else
        cout << inp.length();
    return 0;
}