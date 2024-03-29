package com.spiringcore.annotations.auto;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting value");
        this.address = address;
    }

    public Emp() {
        super();
    }

    public Emp(Address address) {
        super();
        this.address = address;
        System.out.println("Inside Constructor");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
