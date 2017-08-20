/*

Given K sorted linked list your task is to merge them. You need to complete mergeKList  method that takes 2 arguments the arr[] that represents an array of sorted linked lists and an integer N denoting the no. of sorted linked lists. The method needs to return  head of the obtained linked list. There are multiple test cases. For each test case, this method will be called individually.

Please note that it's Function problem i.e. you need to write your solution in the form Function(s) only. Driver Code to call/invoke your function would be added by GfG's Online Judge.*/

Linked list Node structure
struct Node
{
    int data;
    Node* next;
};

arr[] is an array of pointers to heads of linked lists and N is size of arr[].

Answer : 

*/

void minHeapfy(Node *array[],int i,int n){
    int left = 2*i + 1;
    int right = 2*i + 2;
    int min;
    if(left < n && (array[left]->data < array[i]->data))
        min = left;
    else
        min = i;
    if(right < n && (array[right]->data < array[min]->data))
        min = right;
    if(i!=min){
        Node *temp = array[i];
        array[i] = array[min];
        array[min] = temp;
        minHeapfy(array,min,n);
    }
    
}

void buildMinHeap(Node *array[],int n){
    for(int i = n-1;i>=0;i--){
        minHeapfy(array,i,n);
    }
}

Node* deleteMin(Node *array[],int n){
    Node *temp = array[0];
    array[0] = array[n-1];
    array[n-1] = temp;
    n = n - 1;
    minHeapfy(array,0,n);
    return array[n];
}

void insertKey(Node *array[],int n,Node *key){
    n = n + 1;
    array[n - 1] = key;
    int i = n - 1;
    while(i!=0 && array[((int)(i-1)/2)]->data > array[i]->data){
        Node *temp = array[i];
        array[i] = array[((int)(i-1)/2)];
        array[((int)(i-1)/2)] = temp;
        i = ((int)(i-1)/2);
    }
}


Node* reverse(Node *head){
    if(head!=NULL){
        Node *prev = NULL;
        Node *next;
        Node *temp = head;
        while(temp!=NULL){
            next = temp->next;
            temp->next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    else{
        return NULL;
    }
}


Node * mergeKList(Node *arr[], int N)
{
       // Your code here
       Node *array[N];
       int count = 0;
       Node *head = NULL;
        for(int i = 0;i<N;i++){
            if(arr[i]!=NULL){
               array[count++] = arr[i];
               arr[i] = arr[i]->next;
           }
        }
        Node *temp  = array[count-1];
        array[count-1] = array[0];
        array[0] = temp;
        buildMinHeap(array,count);
        while(count!=0){
            Node *newNode = new Node();
            Node *anand = deleteMin(array,count);
            newNode->data = anand->data;
            count--;
            newNode->next = head;
            head = newNode;
            if(anand->next!=NULL){
                insertKey(array,count,anand->next);
                count++;
            }
        }
        head = reverse(head);
        /*while(head!=NULL){
            cout<<head->data;
            head = head->next;
        }*/
       return head;
}