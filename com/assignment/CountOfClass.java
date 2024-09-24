package com.assignment;

public class CountOfClass {
    public static void main(String[] args) {
        One ob1=new One();
        Two ob2=new Two();
        Three ob3=new Three();
        ob1.hello();
        ob2.hello();
        ob3.hello();
    }
}
class One{
    void hello(){System.out.println("Class one ");}
}
class Two{
    void hello(){System.out.println("Class Two ");}
}
class Three{
    void hello(){System.out.println("Class Three ");}
}
