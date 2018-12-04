package com.example.krutant.to_do_listfinal;

public class Combine {

    private String Item;

    private String SubItem;

    public Combine( String task, String description) {

        Item = task;

        SubItem = description;
    }

    public void setItem(String task) {

        Item = task;

    }
    public String getItem() {

        return Item;

    }

    public void setSubItem(String description) {

        SubItem = description;

    }
    public String getSubItem() {

        return SubItem;

    }





}