#include <iostream>
using namespace std;

void push(int size, int *arr, int value)
{
    int top = -1;

    if (top == size - 1)
    {
        cout << "Overflow";
    }
    else
    {
        top++;
        arr[top] = value;
    }
}
int pop()

int main()
{
    int size = 10;
    int *arr = new int[size];
    push(size,arr,10);
    push(size,arr,25);
    cout<<arr[1];
}