// insertion in linked list
#include <iostream>
using namespace std;
void insertion(int &n, int pos, int x, int arr[])
{
    n++;
    int i;
    for (i = n-1; i >= pos; i--)
    {
        arr[i+1] = arr[i];
    }
    arr[pos] = x;

}

int main()
{
    int n = 0;
    // cout<<"Enter the size of array:\n";
    cin >> n;
    int pos = 0;
    int x = 0;
    int *arr = new int[100];
    // cout<<"Enter the elements:\n";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    // cout << "Enter the index where you want insert element:\n";
    cin >> pos;
    // cout << "Enter the element you want to insert:\n";
    cin >> x;
    insertion(n, pos, x, arr);
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}