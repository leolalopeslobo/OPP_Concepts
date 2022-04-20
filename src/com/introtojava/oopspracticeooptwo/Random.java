package com.introtojava.oopspracticeooptwo;

public class Random {
    public static void main(String[] args) {

        A obj = new A("new name");
        System.out.println(obj);

        //println by internally calls the 'toString' method

    }


    static class A {
        int num;
        String name;

        A(String name) {
            this.name = name;
        }

    }
}


/* Packages are containers for classes, it is used to compartmentalise class names
A Package is basically like a folder

com.random
this means that com is one folder which contains another folder


it is basically used for with similar (same) name class but perform a different functions
it's mostly for like visibility
 */