package com.gla;
import java.util.ArrayList;
import java.util.List;

public class MethodLevelGeneric {
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static <T extends Number> void printNumbers(List<T> list) {
        for (T num : list){
            System.out.println(num);
        }
    }

    public static void printNumbersWildcard(List<? extends Number> list) {
        List<? extends Number> list2=new ArrayList<Integer>();

        List<? super Number> list3=new ArrayList<Object>();
        list3.add(42);
        list3.add(3.14);
        System.out.println(list3);

        for (Number num:list){
            System.out.println(num.doubleValue());
        }
    }
    public static void main(String[] args){
        List list = new ArrayList();
    }
}
