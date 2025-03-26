package org.example.constructor;
class AB {
    AB(){
        System.out.println("No-arg");
    }
    AB(int i)
    {
        System.out.println("inc - arg = "+i);
    }
    AB(int i, int j)
    {
        System.out.println("int arg = "+i+" , "+j);
    }
}
public class ConLoad {
    public static void main(String[] args) {
        AB a = new AB();
        AB a1 = new AB(10);
        AB a2 = new AB(20,74);
    }
}
