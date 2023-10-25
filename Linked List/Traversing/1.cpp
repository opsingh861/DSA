#include <iostream>
using namespace std;
struct node
{
    int data;
    node *next;
    node(int x)
    {
        data = x;
        next = NULL;
    }
};
void creation(node *head)
{
    node *p = head;
    while (p != nullptr)
    {
        cout << p->data << " ";
        p = p->next;
    }
    cout << endl;
}
int main()
{
    node *head = new node(1);
    head->next = new node(2);
    head->next->next = new node(3);
    head->next->next->next = new node(4);
creation(head);
    // int size;
    // node *head = NULL;
    // node *temp = NULL;
    // node *n = new node;
    // head = n;
    // temp = n;
    // n->data = 1;
    // // cout<<n->data<<endl;
    // // cout<<head->data<<endl;
    // // cout<<temp->data<<endl;
    // n = new node;
    // n->data = 2;
    // n->next = NULL;
    // // cout<<n->data<<endl;
    // // cout<<head->data<<endl;
    // // cout<<temp->data<<endl;
    // temp->next = n;
    // temp = n;
    // // cout << temp->data;
    // while (head != NULL)
    // {
    //     cout << head->data << endl;
    //     head = head->next;
    // }
}