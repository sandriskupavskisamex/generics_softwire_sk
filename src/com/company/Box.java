package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T> implements Countable {

    List<T> boxContents = new ArrayList<>();

    public void add(T item) {
        boxContents.add(item);
    }

    public int getCount() {
        return boxContents.size();
    }
}
