package com.spiringcore.javaconfig;

import com.spiringcore.lifecycle.Samosa;

public class Student {
    private Samosa  samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        this.samosa.display();
        System.out.println("Student is reading a book");
    }
}
