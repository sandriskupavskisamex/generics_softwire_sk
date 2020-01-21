package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable {

    List<Box> cartContents = new ArrayList<>();

    //Returns total cart content count
    public void add(Box box) {
        cartContents.add(box);
    }

    public int getCount() {
        int count = 0;

        for(int i = 0; i < cartContents.size(); i++) {

            count = count + cartContents.get(i).getCount();

        }
        return count;
    }

}
