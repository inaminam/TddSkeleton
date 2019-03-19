package com.develogical;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RecentlyUsedListTest {

    @Test
    public void emptyListInitialized() {
        assertThat(new RecentlyUsedList().isEmpty(), is(true));
    }

    @Test
    public void ableToAdd() {
        new RecentlyUsedList().add(5);
    }

    @Test
    public void ableToRetrieve() {
        RecentlyUsedList rul = new RecentlyUsedList();
        rul.add(5);
        assertEquals(rul.getAll(), singletonList(5));
    }

    @Test
    public void ableRecentItem() {
        RecentlyUsedList recent = new RecentlyUsedList();
        recent.add(1);
        recent.add(2);
        recent.add(3);
        assertEquals(3, recent.getFirst());
    }

    @Test
    public void duplicateItemNotAdded() {
        RecentlyUsedList rul = new RecentlyUsedList();
        rul.add(1);
        rul.add(1);
        assertThat(rul.getAll(), is(singletonList(1)));
    }

}