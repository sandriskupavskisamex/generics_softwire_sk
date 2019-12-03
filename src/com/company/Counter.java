package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Counter<T extends Countable> {

//============================================
// Not seeing the point of this code below
//
//    public List<T> myCounters = new ArrayList<>();
//
//    public void add(T item) {
//        myCounters.add(item);
//    }
//
//    //Tells you how many counters you have created and added to myCounters list
//    public int getCount() {
//        int count = 0;
//
//        for(int i = 0; i < myCounters.size(); i++) {
//            count++;
//        }
//
//        return count;
//    }
//============================================

    public static void main(String[] args) {

        Apple apple = new Apple();

        Box<Apple> myFirstBox = new Box<>();
        Box<Apple> mySecondBox = new Box<>();
        Box<Apple> myThirdBox = new Box<>();
//============================================
//        Counter myCounters = new Counter();
//============================================
        Cart myCart = new Cart();

        myFirstBox.myBox.add(apple);
        mySecondBox.myBox.add(apple);
        mySecondBox.myBox.add(apple);
        myThirdBox.myBox.add(apple);
        myThirdBox.myBox.add(apple);
        myThirdBox.myBox.add(apple);

        myCart.cartContents.add(myFirstBox);
        myCart.cartContents.add(mySecondBox);
        myCart.cartContents.add(myThirdBox);
//============================================
//        Counter<Apple> appleCounter = new Counter<>();
//        Counter<Apple> totalApplesInCartCounter = new Counter<>();
//        Counter<Box> boxCounter = new Counter<>();
//
//        myCounters.myCounters.add(appleCounter);
//        myCounters.myCounters.add(totalApplesInCartCounter);
//        myCounters.myCounters.add(boxCounter);
//============================================
        System.out.println("Total apple count: " + myCart.getCount());
        System.out.println("Total apples in cart: " + myCart.getCount());
        System.out.println("Apples in second box: " + mySecondBox.getCount());
        System.out.println("Total boxes: " + myCart.cartContents.size());

    }
}
