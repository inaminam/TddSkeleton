package com.develogical;

import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.singletonList;

public class RecentlyUsedList {

    private List<Object> list = new LinkedList<>();

    public boolean isEmpty() {
        return true;
    }

    public void add(Object o) {
        if(!list.contains(o)) {
            list.add(o);
        }
    }

    public List getAll() {
        return  list;
    }

    public Object getFirst() {
        return list.get(list.size() -1);
    }

}
