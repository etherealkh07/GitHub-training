package org.example.constructor;

class AA{
    int i;
    int j;

    AA(int a, int b){
     i = a;
     j=b;
    }
}

public class Test {
    public static void main(String[] args) {
        AA a = new AA(12,32);
        System.out.println(a.i);
        System.out.println(a.j);

        AA a1 = new AA(543,5342);
        System.out.println(a1.i);
        System.out.println(a1.j);
    }
}
