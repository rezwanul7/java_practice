package com.company;

import java.util.List;

public final class Algorithm {
    public static <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0  ? x : y;
    }

    public static <T extends Comparable<T>> T findMax(int begin, int end, List<T> numbers) {
        T max = numbers.get(begin);
        for (int i=begin+1;i<numbers.size() && i<end;i++) {
            T number = numbers.get(i);
            if (max.compareTo(number)<0){
                max = number;
            }
        }
        return max;
    }
}