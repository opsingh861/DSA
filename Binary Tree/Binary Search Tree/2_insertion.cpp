//  this one is written by sir 
#include<iostream>

using namespace std;

struct node
{
	int info;
	node* left = NULL;
	node* right = NULL;
};

node *root = NULL;
node *loc = NULL, *locp = NULL;


void preorder(node *root)
{
	if(root == NULL) return;
	
	cout<<root->info <<"\t";
	preorder(root->left);
	preorder(root->right);
}


void inorder(node *root)
{
	if(root == NULL) return;
	
	inorder(root->left);
	
	if(root->left != NULL)
	cout<<root->info <<"\t";
	
	inorder(root->right);
}

void find(int item)
{
	node *ptr = root, *par = NULL;
	while(ptr != NULL)
	{
		if(item == ptr->info) 
		{
			loc = ptr; locp = par; break;
		}
		else if(item <ptr->info) {
			par = ptr; ptr = ptr->left;
		}
		else{
			par = ptr; ptr = ptr->right;
		}
	}
	if(ptr == NULL) {
		loc = ptr; locp = par;
	}
}

void insert_bst(int item)
{
	find(item);   //updates the loc and locp
	
	if(loc != NULL) cout<<"\nItem already Present";
	else
	{
		node *NEW_NODE = new node;
		NEW_NODE->info = item;
		
		if(locp == NULL) root = NEW_NODE;
		else if(item < locp->info)
		     locp->left = NEW_NODE;
		else locp->right = NEW_NODE;		
	}
}

int main()
{
	int n, key;
	cout<<"\nHow many nodes in BST?:\t";
	cin>>n;
	
	for(int i=0; i<n; i++)
	{
		cout<<"\nEnter the element:\t";
		cin>>key;
		insert_bst(key);
	}
	cout<<"\nPreorder: \t";	
	preorder(root);
	cout<<"\nInorder: \t";
	inorder(root);
	return 0;
}