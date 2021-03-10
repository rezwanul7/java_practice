package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericNumberCollection<T extends Number> {
    List<T> numbers;

    public GenericNumberCollection(List<T> numbers) {
        this.numbers = numbers;
    }

    public int count(UnaryPredicate<T> p){
        int count = 0;
        for (T number : numbers) {
            if (p.test(number)) {
                count++;
            }
        }
        return count;
    }

    public List<T> getNumbers() {
        return numbers;
    }
}
