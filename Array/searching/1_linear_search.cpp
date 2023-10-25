#include<iostream>
using namespace std;
int LinearSearch(int n, int arr[],int x)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i]==x)
        {
            return i;
        }
        
    }
    return -1;
    
}

int main()
{
int n=0;
cout<<"Enter the size number of elements:\n";
cin>>n;
int *arr = new int[n];

cout<<"Enter the elements:\n";
for (int i = 0; i < n; i++)
{
    cin>>arr[i];
}
int x=0;
cout<<"Enter the element you want to search:\n";
cin>>x;
cout<<"Index at which element is present is: "<<LinearSearch(n,arr,x);


}


// worst complexity is n
// best complexity is O(1), when element is found on 0 index or in first iteration.