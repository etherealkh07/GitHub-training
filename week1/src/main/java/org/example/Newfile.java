package org.example;

import javax.sound.midi.SysexMessage;
class A{
    int i = 10 ;
    void m1(){
        System.out.println("m1-a");
    }
     static void m3(){
        System.out.println("m3-a");
    }
}

// extends
class B extends A{
    int i = 20;
    @Override
    void m1(){
        super.m1();
        super.m3();
        System.out.println(super.i);
        System.out.println("m2-b"+i);
    }
}
public class Newfile {
    public static void main(String [] args) {
        B b = new B();
        b.m1();
//        b.m3();
    }
}
