package com.introtojava.oopspracticeooptwo.staticeconcept;


class A {
    static String name;

    A (String name) {
        A.name = name;
    }

    //Override
}


public class InnerClasses3 {
    public static void main(String[] args) {
        A a = new A("kris");
        A b = new A("kim");

        System.out.println(a.name);
        System.out.println(b.name);


        //both the print same ie kim since the same static variable is modified
    }
}
