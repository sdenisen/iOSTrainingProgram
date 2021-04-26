package com.company.doubleSort;

public class Data {

    private int number;
    public int getNumber(){
        return this.number;
    }

    private String name;
    public String getName(){
        return this.name;
    }

    Data(int number, String name){
        this.number = number;
        this.name = name;
    }

    public String toString(){
        return String.format("Data(number=%d; name=%s)", this.number, this.name);
    }
}
