package myListClass;

import java.sql.Array;
import java.util.List;

public class list<T> {
    private Object[] elements;
    private int size;
    private static int DEFAULT_CAPACITY = 10;
    public list() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;

    }
    public list(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Kapasite Sıfırdan büyük olmalı");
        }
        elements = new Object[initialCapacity];
        size = 0;

    }
    //listenin boyutu aşıldıysa kapasitesi iki katı olan bir dizi oluşturur
    private  void checkCapacity() {
        if(size >= elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            for(int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }
    //indexin geçerli olup olmadığını kontrol eder
    private void checkIndex(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Geçersiz İndex");

        }
    }

    public Object[] toArray() {
        checkCapacity();
        Object[] array = new Object[size];
        for(int i = 0; i < size; i++) {
            array[i] = elements[i];
        }
        return array;
    }
    public void add(T element) {
        checkCapacity();
        elements[size++] = element;
    }
    public int getIndex(T data)
    {
        for (int i = 0; i < this.size; i++)
        {
            if (elements[i].equals(data))
            {
                return i;
            }
        }

        return -1;
    }
    public list<T> subList(int fromIndex, int toIndex)
    {
        if(fromIndex > toIndex || fromIndex <0 || toIndex > size) {
            throw new IllegalArgumentException("Geçersiz indeks aralığı");
        }
        list<T> newList = new list<>(toIndex-fromIndex+1);
        for(int i = fromIndex; i <= toIndex; i++) {
            newList.add((T) elements[i]);
        }
        return newList;
    }

    public T remove(int index) {
        checkIndex(index);
        T removed = (T) elements[index];
        for(int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[-- size] = null;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public int capacity() {
        return elements.length;
    }

    public void clear() {
        for(int i = 0; i < size; i++) {
            elements[i] = null;
        }

        size = 0;
    }

    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == null && item == null) {
                return true;
            } else if (elements[i] != null && elements[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    public int lastIndexOf(T item) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i] == item) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public T get(int index)
    {
        if (index < 0 || index >= size)
        {
            return null;
        }

        return(T) elements[index];
    }



}
