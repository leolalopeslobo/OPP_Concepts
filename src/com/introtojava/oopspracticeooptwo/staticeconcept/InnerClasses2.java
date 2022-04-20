package com.introtojava.oopspracticeooptwo.staticeconcept;

public class InnerClasses2 {
    //here the inner class is static, and it will not depend on the objects of the outer class
    static class A {
        String name;

        A (String name) {
            this.name = name;
        }

    }


    static class B {
        String occupation;

        B (String occupation) {
            this.occupation = occupation;
        }
    }


    public static void main(String[] args) {
        A a = new A("sandy");
        A c = new A("sweden");

        System.out.println(a.name);
        System.out.println(c.name);


        B b = new B("engineer");

        System.out.println(b.occupation);
    }

    //here the inner classes do not need to depend on the objects of innerclasses2
}

//Overloading: when two or more functions have the same name but different parameters
//Overriding: when two or more functions have the same name and parameters, when overrides the other one
