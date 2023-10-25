#include <iostream>
using namespace std;
class node
{
public:
    int data;
    node *next;

    // constructor
    node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};
void Print(node *head)
{
    while (head != NULL)
    {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}
void insert_at_head(node *&head, int d)
{
    node *temp = new node(d);
    // if (head == NULL)
    // {
    //     head = temp;
    // }
    // else

    temp->next = head;
    head = temp;
}
void insert_at_last(node *tail, int d)
{
    node *temp = new node(d);
    tail->next= temp;
    tail = temp;
    // if (head->next == NULL)
    // {

    //     head->next = temp;
    // }
    // else if (head == NULL)
    // {

    //     head = temp;
    // }
    // else
    // {
    //     while (head != NULL)
    //     {
    //         head = head->next;
    //     }
    // }

    // if (head == null)
    // {
    //     node* temp =
    // }
}
int main()
{
    node *head = NULL;
    node *tail = NULL;
    node* node1 = new node(10);
    // cout<<node1->data;
    head = node1;
    tail = node1;
    // node* node2 = new node(5);
    // node1->next = node2;
    // Print(head);
    // insert_at_head(head,2);
    insert_at_head(head,3);
    Print(head);
    insert_at_last(head, 25);
    Print(head);
    insert_at_last(tail,14);
    Print(head);
}