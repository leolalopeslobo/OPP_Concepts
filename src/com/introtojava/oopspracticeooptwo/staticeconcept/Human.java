package com.introtojava.oopspracticeooptwo.staticeconcept;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static long population; //this means that

    //'static' mean if property/method that is not related to the object, its object independent
    //static basically means constant it doesn't change, and therefore it won't change wrt an object

    static void message () {
        System.out.println("hey! im a static method of class Human");
        // System.out.println(this.name); // -> error: since this here means that it depends on an object
        //but here the method is independent of objects
    }

    //creating constructor
    public Human (int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1; //you don't need to use 'this' here since it doesn't depend on objects
        //and this replaces the reference variable
        //hence, you can use the class name instead -> since it will directy update the class and not check if the variable exixts in the object
        //since they do not depend on objects
    }
}
