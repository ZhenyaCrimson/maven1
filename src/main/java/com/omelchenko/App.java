package com.omelchenko;

import com.omelchenko.Array;
public class App {
    public static void main(String[] args){
        run();
    }
private static void run(){
        int []mas = {2, 7, 3, 8, 4, 10};
        Array obj1 = new Array(mas);
        System.out.print("Elementu  ");
        obj1.printMas();
        System.out.println();
        System.out.println("Max element = "+ obj1.findMaxElement());
        obj1.findMaxElement();
        System.out.print("Odd element  ");
        obj1.findOddElements();
        }
        }