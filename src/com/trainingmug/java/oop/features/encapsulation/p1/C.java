package com.trainingmug.java.oop.features.encapsulation.p1;

public class C extends A{
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        // System.out.println(a.y); can't access
        System.out.println(a.z);
        System.out.println(a.value);
    }
}
