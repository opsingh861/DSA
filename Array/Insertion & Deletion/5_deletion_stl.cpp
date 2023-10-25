#include <bits/stdc++.h>
using namespace std;
void show(vector<int> v)
{
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
    }
    cout<<endl;
}
int main()
{
    int size = 0;
    cout << "Enter the size of array: ";
    cin >> size;
    cout << "\nEnter the elements: ";
    int element = 0;
    int index = 0;
    vector<int> v;
    for (size_t i = 0; i < size; i++)
    {
        cin >> element;
        v.push_back(element);
    }
    vector<int>::iterator iter = v.begin();
    cout << "\nEnter the index of element you want to delete: ";
    cin >> index;
    v.erase(iter + index);
    show(v);
    return 0;
}