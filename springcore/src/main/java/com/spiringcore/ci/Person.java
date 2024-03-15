package com.spiringcore.ci;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certi certi;

    private List<String> list;


//    public Person(String name, int personId,Certi certi) {
//        this.name = name;
//        this.personId = personId;
//        this.certi=certi;
//    }

    public Person(String name, int personId,Certi certi,List<String> list) {
        this.name = name;
        this.personId = personId;
        this.certi=certi;
        this.list=list;
    }

    @Override
    public String toString() {
        return this.name+ " \n " +this.personId+"  \n "+this.list+"\n"+"{"+this.certi.name+"}";
    }


}
