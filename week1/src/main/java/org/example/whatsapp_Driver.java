package org.example;

class whatsapp1 {
    public void sent(){
        System.out.println("single tick ");
    }
}
class whatsapp2 extends whatsapp1{
    @Override
    public void sent(){
        super.sent();
        System.out.println("double tick");
    }
    public void voicemsg() {
        System.out.println("voice msg");
    }
}
class whatsapp3 extends whatsapp2{
    @Override
    public void sent(){
        super.sent();
        System.out.println("double tick && blue tick ");
    }
    public void videocall(){
        System.out.println("videocall ");
    }
}
class whatsapp4 extends whatsapp3{
    @Override
    public void videocall(){
        super.videocall();
        System.out.println("4K video call");
    }
}
public class whatsapp_Driver {
    public static void main(String[] args) {
        whatsapp4 w = new whatsapp4();
        w.sent();
        w.voicemsg();
        w.videocall();
    }
}