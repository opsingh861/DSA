#include <iostream>
using namespace std;
void deletion(int & n, int arr[], int pos)
{
    int i =0;
    for ( i =pos; i<n-1; i++)
    {
        arr[i] = arr[i+1];
    }
n--;
    
}



int main()
{
    int n = 0;
    cout<<"Enter the size of array: ";
    cin>> n;
    int pos = 0;
    // int x = 0;
    int *arr = new int[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter the index of element you want to delete: ";
    cin>>pos;
    deletion(n,arr,pos);
    // show(n,arr);
for (int i = 0; i < n; i++)
{
    cout<<arr[i]<<" ";
}
return 0;

}