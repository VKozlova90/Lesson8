package com.company;

public class Person <T> {

    private Object name;
    private Object lastName;
    private Address address;

    public Person(Object name, Object lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public T getname() {
        return (T) name;
    }

    public T getlastName() {
        return (T) lastName;
    }

    public Address getaddress() {
        return (Address) address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", lastName=" + lastName +
                ", address=" + address +
                '}';
    }
}
