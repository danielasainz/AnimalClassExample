package com.Sainz.demo;

public class Monkey extends Animal {
    public Monkey() {
    }

    @Override
    public String sleep() {
        return "A monkey sleeps in the trees...";
    }

    @Override
    public String eat() {
        return "A monkey eats bananas...";
    }

    public String tree () {
        return "A monkey swings from trees...";
    }
}
