package com.company;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Counter<T extends Countable> implements Countable {

//============================================

    private ArrayList<T> listOfCountedObjects = new ArrayList<>();
    private String colorToOnlyCount = "";

    public void add(T item) {
        if(colorToOnlyCount.isEmpty()) {
            listOfCountedObjects.add(item);
        } else {
            Apple appleItem = (Apple)item;
            if(appleItem.color.equals(this.colorToOnlyCount)) {
                listOfCountedObjects.add(item);
            }
        }

    }


    //Tells you how many counters you have created and added to myCounters list
    public int getCount() {
        return listOfCountedObjects.size();
    }

    public boolean shouldBeCounted(T someObject, Predicate<T> condition) {

        return condition.test(someObject);

    }

    public Counter() {
    }

    public Counter(String colorToOnlyCount) {

        this.colorToOnlyCount = colorToOnlyCount;

    }

}
