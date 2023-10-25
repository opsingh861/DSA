// stack using stl
#include <iostream>
#include <stack>
using namespace std;

int main()
{ 
    int n = 0;
    cout<<"Enter the number of elements you want to push in stack.";
    cin>> n;
    stack<int> s;
    while (n--)
    {
        int data;
        cin>>data;
        s.push(data);
    }
    

    // s.push(2);
    // s.push(3);
    // s.push(5);
    cout << "The top is: " << s.top() << endl;
    s.pop();
    cout << "The top is: " << s.top() << endl;
    cout<<"Size of stack is:"<<s.size()<<endl;

    if (s.empty())
    {
        cout << "Stack is empty.";
    }
    else
        cout << "Stack is not empty";
    

    return 0;
}