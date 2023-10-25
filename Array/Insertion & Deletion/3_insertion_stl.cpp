#include <iostream>
#include <vector>
using namespace std;
void show(vector<int> vec)
{
    for (int i = 0; i < vec.size(); i++)
    {
        cout << vec[i] << " ";
    }
    cout << endl;
}
int main()
{
    int size = 0;
    cin >> size;
    int element;
    vector<int> vec; // creating a vector of int type "vec"
    for (int i = 0; i < size; i++)
    {
        cin >> element;
        vec.push_back(element);
    }
    show(vec);
    vector<int>::iterator iter = vec.begin(); // creating iterator of vector type "iter"
    int pos = 0;
    cin >> pos;
    int x = 0;
    cin >> x;
    vec.insert(iter + pos, x);
    show(vec);
    return 0;
}