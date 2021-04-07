package com.rezwanul7.collections.data;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    private T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item){
        items[count++] = item;
    }
    public T get(int index){
        return items[index];
    }
    public int size(){
        return count;
    }


    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator<>(this);
    }

    static class GenericListIterator<T> implements Iterator<T> {
        GenericList<T> list;
        int index;

        public GenericListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index<list.size();
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
