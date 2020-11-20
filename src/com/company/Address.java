package com.company;

public class Address <T> {

    private  Object city;
    private Object street;
    private int number;

    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public T getcity() {
        return (T) city;
    }

    public T getstreet() {
        return (T) street;
    }

    public int getnumber() {
        return (int) number;
    }

    public void printinfo(){
        System.out.println(city + " " + street + " " + number);
    }

}
