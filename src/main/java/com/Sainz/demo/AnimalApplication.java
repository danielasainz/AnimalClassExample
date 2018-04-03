package com.Sainz.demo;

import static jdk.nashorn.internal.objects.Global.print;

public class AnimalApplication {
private static void main (String [] args) {

    Animal a = new Animal();
    print(a.eat());
    print(a.sleep());

    Monkey b = new Monkey();
    print(b.eat());
    print(b.sleep());
    print(b.tree());

    Dog c = new Dog();
    print(c.eat());
    print(c.sleep());
    print(c.bark());

    Fish d = new Fish();
    print(d.eat());
    print(d.sleep());
    print(d.swim());

    Unicorn e = new Unicorn();
    print(e.eat());
    print(e.sleep());
    print(e.gallop());

    Sabertoothtiger f = new Sabertoothtiger();
    print(f.eat());
    print(f.sleep());
    print(f.roar());

}
private static void print (String s) {
    System.out.println(s);
    }
}
