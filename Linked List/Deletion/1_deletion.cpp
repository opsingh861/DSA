#include <iostream>
using namespace std;

struct node
{
    int data;
    node *next;
};

node *insert_at_beg(node *head, int d)
{

    node *temp = new node;
    temp->data = d;

    temp->next = head;
    head = temp;
    return head;
}

node *insertion(node *head, int d)
{

    if (head == NULL)
    {
        return insert_at_beg(head, d);
    }
    else
    {

        node *p = head;

        while (p->next != NULL)
        {
            p = p->next;
        }
        node *temp = new node;
        temp->data = d;
        temp->next = NULL;
        p->next = temp;
        return head;
    }
    return nullptr;
}
node *deletion(node *head, int value)
{
    node *pre = NULL;
    node *curr = head;
    while (curr != NULL)
    {

        if (curr->data == value)
        {
            pre->next = curr->next;
            delete curr;
            break;
        }
        pre = curr;
        curr = curr->next;
    }
    return head;
}
void print(node *head)
{
    node *temp;
    temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}
int main()
{
    node *head;
    head = NULL;
    int n = 0;
    cin >> n;
    int d;
    for (int i = 0; i < n; i++)
    {
        cin >> d;
        head = insertion(head, d);
        // head = insert_at_beg(head, d);
    }

    print(head);
    cout << endl;
    int value;
    cin >> value;
    head = deletion(head, value);
    print(head);
    return 0;
}
