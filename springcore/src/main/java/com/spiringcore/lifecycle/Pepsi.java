package com.spiringcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price='" + price + '\'' +
                '}';
    }

    public void afterPropertiesSet()throws Exception{
        System.out.println("Taking Pepsi : init");
    }

    public void destroy()throws Exception{
        System.out.println("Going to put bottle back to shop:destroy");
    }
}
