package com.company.doubleSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayAction {

    public static List<Data> doubleSortOfArray(List<Data> r){
        Comparator<Data> comparator = Comparator.comparing(Data::getNumber);
        comparator = comparator.thenComparing(Data::getName);
        Stream<Data> data_stream = r.stream().sorted(comparator);
        return data_stream.collect(Collectors.toList());
    }

    public static List<Data> generateArray(){
        char[] alphabet = "abc".toCharArray(); //
        var r = new ArrayList<Data>();
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                r.add(new Data(i, String.valueOf(alphabet[j])) );
            }
        }
        Collections.shuffle(r);
        return r;
    }
}
