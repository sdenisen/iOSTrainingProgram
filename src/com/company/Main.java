package com.company;
import com.company.doubleSort.ArrayAction;
import com.company.linkedList.objects.IntegerNode;
import com.company.linkedList.LinkedList;
import com.company.linkedList.objects.StringNode;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("************\nSorting by two object attributes;\n************");
        System.out.println("************\nGenerate random array;\n************");
        var init_data_array = ArrayAction.generateArray();
        init_data_array.forEach(System.out::println);

        System.out.println("************\nSort the array;\n************");
        var sorted_array = ArrayAction.doubleSortOfArray(init_data_array);
        sorted_array.forEach(System.out::println);

        System.out.println("************\nLinked List that can use different object types;\n************");
        var any_list = new LinkedList();
        var int_obj = new IntegerNode(10);
        var int_obj_2 = new IntegerNode(20);
        var str_obj = new StringNode("ABC");
        any_list.add(int_obj);
        any_list.add(int_obj_2);
        any_list.add(str_obj);
        any_list.remove(0);
        any_list.print();
    }


}
