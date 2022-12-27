package org.example;

public class Knight {
    private String name;
    private String country;
    private boolean horseYesOrNo;
    private int age;

    Knight(String name) {
        this.name = name;
    }

    Knight(String name, String country, boolean horseYesOrNo, int age) {
        this.name = name;
        this.country = country;
        this.horseYesOrNo = horseYesOrNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public boolean isHorseYesOrNo() {
        return horseYesOrNo;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHorseYesOrNo(boolean horseYesOrNo) {
        this.horseYesOrNo = horseYesOrNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
