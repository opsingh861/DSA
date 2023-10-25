#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int traversing(int n, char arr[])
{
    int c = 0;
    for(int i=0; i<n; i++)
    {
        if(islower(arr[i]))
        {
            c++;
        }
    }
    if(c==0)
    {
        return -1;
    }
        
    else return c;
}
int main() {
int n =0;
cin>>n;
if(n<0 || n>20)
{
cout<<"Invalid array size";
    
    return 0;
}
else
{
    char *arr = new char[n];
    
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    cout<<traversing(n,arr);
    
      return 0;
}

  
}
