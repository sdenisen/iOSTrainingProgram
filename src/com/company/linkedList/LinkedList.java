package com.company.linkedList;
import com.company.linkedList.objects.Node;

public class LinkedList {
    private Node head;
    private int length = 0;

    public void add(Node obj){
        if (this.head == null){
            this.head = obj;
        } else {
            Node last = this.head;
            while(last.next != null)
                last = last.next;
            last.next = obj;
            this.length++;
        }
    }

    public void remove(int index) throws Exception {
        if (index > this.length){
            throw new Exception("index out of range");
        }

        Node iter = this.head;
        for (int i=0; i<index-1; i++){
            iter = iter.next;
        }
        iter.next = iter.next.next;
        this.length--;
    }

    public void print(){
        Node last = this.head;
        while(last.next!=null){
            last.print();
            last = last.next;
        }
        last.print();
    }

}
