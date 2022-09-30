package org.launchcode.techjobs.oo;

import java.util.Objects;


public abstract class JobField {

    public int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }



    @Override
    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }



    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
