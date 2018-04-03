package com.Sainz.demo;

public class Unicorn extends Animal {
    public Unicorn() {
    }
    @Override
    public String sleep() {
        return "A unicorn sleeps...";
    }

    @Override
    public String eat() {
        return "A unicorn eats...";
    }

    public String gallop() {
        return "A unicorn gallops...";
    }
}
