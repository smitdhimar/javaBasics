import java.io.*;
import java.util.*;
import static java.lang.System.out;

class doublyLinkedList {
  public static void main(String args[]) {
    LinkedList root = new LinkedList();
    root.insert(1);
    root.insert(87);
    root.insert(21);
    root.insert(100);
    root.insert(23);
    root.traverse();
  }
}
class node{
  node prev;
  node next;
  int info;
  node(){
    info=0;
    prev=next=null;
  }
  node(int a)
  {
    info=a;
    prev=next=null;
  }
}
class LinkedList {
node head;
void insert(int a){
  node newnode=new node(a);
  if(head==null){
    head=newnode;
    return;
  }
  if(head.next==null){
    if(head.info>a){
      head.prev=newnode;
      newnode.next=head;
      head=newnode;
      return;
    }
    else{
      head.next=newnode;
      newnode.prev=head;
      return;
    }
  }
  if(head.info>a){
    newnode.next=head;
    head.prev=newnode;
    head=newnode;
    return;
  }
  node preserve=head,tp=head;
  while(tp!=null){
    if(tp.info>a)
    {
      tp.prev.next=newnode;
      newnode.prev=tp.prev;
      newnode.next=tp;
      tp.prev=newnode;
      return;
    }
    preserve=tp;
    tp=tp.next;
  }
  preserve.next=newnode;
  newnode.prev=preserve;
  
}
  LinkedList() {
    head=null;
  }
void traverse()
  {
    node tp=head;
    while(tp!=null)
      {
        out.print(tp.info+" ");
        tp=tp.next;
      }
  }
  }
