package com.omelchenko;

public class Array {
    private int array[];
    private int max;
    private int odd;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printMas(){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public Array(int[] array) {
        this.array = array;
    }

    public int findMaxElement() {
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //System.out.println("MAX ="+ max);
        return max;
    }


    public void findOddElements() {
        //odd = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd = array[i];
                System.out.print(array[i]+" ");
                //return array[i];
            }
        }
    }
}
