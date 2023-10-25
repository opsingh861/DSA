#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class node
{
    public:
        int data;
        node *link;
};

node *first,*temp;

class LinkedList
{
    public:
    node *first,*last;
    LinkedList();
    void create();
    int check(int);
    void printe(int,int);
    void printo(int);
};
LinkedList::LinkedList()
{
    first = NULL;
    last = NULL;
};

void LinkedList::create()
{
    node *temp=new node();
    cin>>temp->data;
    temp->link=NULL;
    if(first==NULL)
    {
        first=temp;
        last=first;
    }
    else
    {
        last->link=temp;
        last=temp;
    }
};



void LinkedList::printe(int x,int n)
{
    node *temp;
    temp=first;
    int a;
    int i=0;
    int printed =0;
    
    while(temp!=NULL)
    {
        a=temp->data;
        
        if(a%2==0 && printed==0 && x>a){
                cout<<x<<' ';
                printed =1;
            }
            cout<<a<<" ";
            if(a%2==0 && x<a && x>a && printed==0){
                cout<<x<<' ';
                printed =1;
            }
        if(i==n-1 && printed ==0)
            cout<<x;
        
        temp=temp->link;
        i++;
    }
}
void LinkedList::printo(int x)
{
    node *temp;
    temp=first;
    int a;
    // int count=1;
    int printed=0;
    int i=0;
    
    while(temp!=NULL)
    {
        a=temp->data;
        if(a%2==1 && x<a && printed ==0){
             cout<<x<<" ";
             printed =1;
         }
         if(i==0 && a%2==0 && printed ==0){
             cout<<x<<" ";
             printed =1;
         }
        cout<<a<<' ';
        temp=temp->link;
        i++;
    }
}

int LinkedList::check(int add)
{
    node *temp;
    temp=first;
    int a;
    
    while(temp!=NULL)
    {
        a=temp->data;
        if(a==add){
            return 1;
        }
        temp=temp->link;
    }
    return 0;
}

int main() {
   int n;
    cin>>n;
    
    LinkedList l1;
    
    for(int i=0;i<n;i++){
        l1.create();
    }
    
    int add;
    cin>>add;
    
    if(l1.check(add)==1){
        cout<<"Duplicates are not allowed";
        return 0;
    }
    
    if(add%2==0)
        l1.printe(add,n);
    else
        l1.printo(add); 
    
    return 0;
}