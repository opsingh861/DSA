#include <bits/stdc++.h>
using namespace std;

int main()
{
    int size = 0;
    cin >> size;
    int ticket = 0;
    string name = "a";

    stack<string> Stack[size];

    while (size--)
    {
        cin >> name;
        Stack->push(name);
    }
    if (ticket>size)
    {
        cout<<"Houseful";
    }
    else
    {
        cout<<"Booked";
    }
    return 0;
}