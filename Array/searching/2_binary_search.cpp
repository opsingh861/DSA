#include <iostream>
using namespace std;
int BinarySearch(int arr[], int x, int size)
{
    int beg = 0;
    int end = size - 1;
    int mid = beg + (end - beg) / 2;
    while (beg <= end)
    {
        if (arr[mid] == x)
        {
            return mid;
        }
        if (arr[mid] < x)
        {
            beg = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
        mid = beg + (end-beg)/2;
    }
    return -1;
}
int main()
{
    int size = 5;
    int arr[size] = {1, 2, 3, 4, 5};
    int x = 0;
    cout << "Enter the element you want to search:\n";
    cin >> x;
    // cout<<arr[2];
    cout << "index of the element is: \n"
         << BinarySearch(arr, x, size) + 1;
    return 0;
}


// best complexity is 1
// worst complexity is O(nlogn)