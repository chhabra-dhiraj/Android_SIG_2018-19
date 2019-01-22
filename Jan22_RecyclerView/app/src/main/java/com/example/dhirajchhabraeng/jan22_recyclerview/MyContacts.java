package com.example.dhirajchhabraeng.jan22_recyclerview;

public class MyContacts {

    public String name;

    public MyContacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
