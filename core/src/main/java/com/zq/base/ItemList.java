package com.zq.base;


import java.util.List;

/**
 * @author zhaoqi
 * @since 2020-11-09
 */

public class ItemList<T>{

    private List<T> items;

    ItemList(List<T> items) {
        this.items = items;
    }

    public static <T> ItemList<T> buildItems(List<T> items) {
        ItemList itemList = new ItemList<>(items);
        return itemList;
    }


    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
