package com.example.demo.model;

public class Inimene {
    
    public int x;
    public int y;
    public String name;
    public char gender;
    public String type;

    public Inimene(String name, char gender, String type) {
        this.x = 5;
        this.y = 5;

        this.name = name;
        this.gender = gender;
        this.type = type;
    }

    public String toString(){
        return this.name;
    }
}
