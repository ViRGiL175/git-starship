/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by haze on 22.03.2017.
 */
public class Storage {

    protected HashMap<String, IStorageable> itemsHashMap;
    private int capacity;

    public HashMap<String, IStorageable> getItemsHashMap() {
        return itemsHashMap;
    }

    public void setItemsHashMap(HashMap<String, IStorageable> itemsHashMap) {
        this.itemsHashMap = itemsHashMap;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Set<String> getAllItemNames() {
        return itemsHashMap.keySet();
    }

    public void putItem(IStorageable iStorageable) {

    }

    public void getItem(String itemName) {

    }
}
