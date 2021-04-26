package com.company;
import com.company.doubleSort.ArrayActions;

public class Main {

    public static void main(String[] args) {
        var init_data_array = ArrayActions.generateArray();
        init_data_array.forEach(System.out::println);

        var sorted_array = ArrayActions.doubleSortOfArray(init_data_array);
        sorted_array.forEach(System.out::println);
    }
}
