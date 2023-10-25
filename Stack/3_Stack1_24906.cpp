#include <bits/stdc++.h>
using namespace std;

int main()
{
    int choice = 0;
    cin >> choice;
    int n = 0;
    cin >> n;

    string colours;

    stack<string> st;
    for (int i = 0; i < n; i++)
    {
        cin >> colours;
        st.push(colours);
    }
    cin>>choice;
    cout << st.top();
    st.pop();
    cout << endl;
    while (n--)
    {
        cout<<st.top()<<endl;
        st.pop();
    }
    return 0;
}