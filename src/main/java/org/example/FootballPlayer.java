package org.example;

public class FootballPlayer {
    private String name;
    private String position;
    private int number;
    private int age;

    FootballPlayer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    FootballPlayer(String name, String position, int number, int age) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
