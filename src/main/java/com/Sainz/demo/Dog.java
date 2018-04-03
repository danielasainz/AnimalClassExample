package com.Sainz.demo;

public class Dog extends Animal {
    public Dog() {
    }

    @Override
    public String sleep() {
        return "A Dog sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A dog eats quickly...";
    }
        public String bark() {
            return "A dog barks loudly...";
        }
    }
