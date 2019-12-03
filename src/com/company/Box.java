package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T> implements Countable {

    List<T> myBox = new ArrayList<>();

    public int getCount() {
        return myBox.size();
    }

}
