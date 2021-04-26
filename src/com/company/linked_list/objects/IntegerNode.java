package com.company.linked_list.objects;

public class IntegerNode extends Node {
    private int value;
    public int getValue(){
        return this.value;
    }

    public IntegerNode(int value){
        this.value = value;
    }

    public void print(){
        System.out.println(String.format("IntegerNode: value=%d", this.value));
    }
}
