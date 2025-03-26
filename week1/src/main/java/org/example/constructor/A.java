package org.example.constructor;

public class A {
    public A(int i){
        System.out.println("A-cons "+i);
    }

    public static void main(String[] args) {
        new A(5);
        new A(55);

    }
}
