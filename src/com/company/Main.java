package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box<Apple> myFirstBox = new Box<>();
        Box<Apple> mySecondBox = new Box<>();
        Box<Apple> myThirdBox = new Box<>();
//============================================
        Counter counterOfCounters = new Counter<>();
//============================================
        Cart myCart = new Cart();

        myFirstBox.add(new Apple("Red"));
        mySecondBox.add(new Apple("Golden"));
        mySecondBox.add(new Apple("Green"));
        myThirdBox.add(new Apple("Pink"));
        myThirdBox.add(new Apple("Red"));
        myThirdBox.add(new Apple("Green"));

        myCart.add(myFirstBox);
        myCart.add(mySecondBox);
        myCart.add(myThirdBox);
//============================================

        Counter<Apple> appleCounter = new Counter<>();
        Counter<Apple> redAppleCounter = new Counter<>("Red");
        Counter<Apple> totalApplesInCartCounter = new Counter<>();
        Counter<Box> boxCounter = new Counter<>();

        counterOfCounters.add(appleCounter);
        counterOfCounters.add(totalApplesInCartCounter);
        counterOfCounters.add(boxCounter);
//============================================

        appleCounter.add(new Apple("Red"));
        appleCounter.add(new Apple("Yellow"));
        appleCounter.add(new Apple("Green"));

        redAppleCounter.add(new Apple("Blue"));
        redAppleCounter.add(new Apple("Blue"));
        redAppleCounter.add(new Apple("Blue"));
        redAppleCounter.add(new Apple("Red"));
        redAppleCounter.add(new Apple("Red"));

        System.out.println("There are " + counterOfCounters.getCount() + " counters.");
        System.out.println("Apples counted with apple counter: " + appleCounter.getCount());
        System.out.println("Apples counted with red apple counter: " + redAppleCounter.getCount());
        System.out.println("Total apples in cart: " + myCart.getCount());
        System.out.println("Apples in second box: " + mySecondBox.getCount());
        System.out.println("Total boxes: " + myCart.cartContents.size());


    }
}
