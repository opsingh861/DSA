#include <bits/stdc++.h>

using namespace std;

struct node
{
    char grade;
    int roll_number;
    node *next;
};

void insert_at_end(node *&head)
{
    int rolln;
    char g;
    cin >> rolln;
    cin >> g;
    node *temp = new node;
    temp->grade = g;
    temp->roll_number = rolln;
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
    int flag = 0;
    node *temp = head;
    while (temp != NULL)
    {
        if (roll == temp->roll_number)
        {
            flag = 1;
            cout << "You have secured " << temp->grade << " grade";
        }
        temp = temp->next;
    }
    if (flag == 0)
        cout << "You have not appeared for the Contest-1";
}

int main()
{
    node *head = NULL;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        insert_at_end(head);
    }
    int roll_no;
    cin >> roll_no;
    search(head, roll_no);

    return 0;
}