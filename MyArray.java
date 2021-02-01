package com.rch;

public class MyArray {
    private int[] array;

    public MyArray(int[] initArray){
        this.array=initArray;
    }

    public int count(){
        return array.length;
    }

    public void add(int element){
        add(element,array.length+1);
    }
    public void add(int element, int pos){
        int[] newArray = new int[array.length + 1];
        int indexOld = 0;

        for (int i = 0; i < newArray.length; i++)
            newArray[i] = (i==pos-1) ? element : array[indexOld++];

        array = newArray;
    }

    public void remove(int pos){
        if (pos > array.length) return;

        int[] newArray = new int[array.length - 1];
        int indexOld = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i == pos - 1) indexOld++;
            newArray[i] = array[indexOld++];
        }

        array = newArray;
    }

    public void edit(int pos, int newValue){
        if (pos > array.length) return;
        array[pos-1] = newValue;
    }

    public int getExtremum(String type){
        if (!type.equals("max") && !type.equals("min")) return 0;

        int extr = array[0];
        for (int i = 1; i < array.length; i++)
            extr = type.equals("max") ? Math.max(extr, array[i]) : Math.min(extr, array[i]);

        return extr;
    }

    public int[] sort(String type){
        if (!type.equals("asc") && !type.equals("desc")) return null;

        int[] result = array.clone();
        boolean isDone;

        while(true){
            isDone = true;
            for (int i = 0; i < result.length - 1; i++) {
                if (type.equals("asc") ? (result[i] > result[i + 1]) : (result[i] < result[i + 1])){
                    int tmp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = tmp;
                    isDone = false;
                }
            }
            if (isDone) return result;

        }
    }

    public void transformTo(int value){
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
