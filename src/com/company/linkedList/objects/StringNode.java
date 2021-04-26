package com.company.linkedList.objects;

public class StringNode extends Node {
    private String value;
    public String getValue(){
        return this.value;
    }

    public StringNode(String value){
        this.value = value;
    }

    public void print(){
        System.out.println(String.format("StringNode: value=%s", this.value));
    }
}
