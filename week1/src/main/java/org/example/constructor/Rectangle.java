package org.example.constructor;

public class Rectangle {
    int lenght;
    int breath;

    Rectangle(int lenght, int breath)
    {
        this.lenght = lenght;
        this.breath = breath;
    }
    public void display()
    {
        System.out.println("lenght = "+ lenght);
        System.out.println("breath = "+ breath);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(21,65);
        r.display();
        Rectangle rr = new Rectangle(78,65);
        rr.display();
    }
}
