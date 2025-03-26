package org.example.oops;

class Animal {
    void Sound()
    {
        System.out.println("Make the sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barkingg....");
    }
}

class SmallDog extends Dog{
    void run() {
        System.out.println("runnn...");
    }
}
class  Cat extends  Animal{
    void cheat()
    {
        System.out.println("cheat");
    }
}
public class inheritances {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.Sound();
        System.out.println("------------------------------");
        SmallDog sd = new SmallDog();
        sd.run();
        sd.Sound();
        sd.bark();
        System.out.println("------------------------------------");
        Cat c = new Cat();
        c.cheat();
        c.Sound();


    }
}
