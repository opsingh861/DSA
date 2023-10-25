#include <bits/stdc++.h>
using namespace std;

class node
{
public:
    char grade;
    int roll_number;
    node *next;
    node(char g, int rolln)
    {
        this->grade = g;
        this->roll_number = rolln;
        this->next = NULL;
    }
};

void insert_last(node *head, char g, int rolln)
{
    node *temp = new node(g, rolln);
    if (head == NULL)
    {
        temp->next = NULL;
        head = temp;
    }
    else
    {
        temp->next = head;
        head = temp;
    }
}

void search(node *head, int roll)
{
    node *temp = head;
    while (temp != NULL)
    {
        if (temp->roll_number == roll)
        {
            cout << "Grade assured by " << roll << " is " << temp->grade;
        }
        else
        {
            temp = temp->next;
        }
    }
}
int main()
{
    node *head = NULL;
    int n = 0;
    cin >> n;
    int rolln = 0;
    char g;
    cin >> g;
    cin >> rolln;
    // node *node1 = new node(rolln, g);
    for (int i = 0; i < n; i++)
    {
        cin >> rolln;
        cin >> g;
        insert_last(head, rolln, g);
    }
    int roll;
    cin>> roll;
    search(head, roll);
    return 0;
};