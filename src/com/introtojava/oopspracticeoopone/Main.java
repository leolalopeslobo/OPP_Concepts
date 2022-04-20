package com.introtojava.oopspracticeoopone;

public class Main {
    public static void main(String[] args) {
        //A Class is a named grouped of properties and functions
        //By convention class name begins with a Capital letter
        //Classes can be used to create your own datatype
        //So basically classes are datatypes

       // Student student; //declaration  ---- this is an object, like an instance
        // student - reference variable
       // student = new Student();

        //Object is like a physical reality
        //Objects occupies space in the memory (Heap Memory)


        //Variables inside an object are known as 'instance variables',
        //it should be outside the methods, constructors, etc.
        //Variables that are used to create objects are known as 'reference variables'

        //When an object is not initialized the default value is 'null'

        Student student1 = new Student(); //creating an object of a class - instantiating
        //'new' helps create an object in the memory

        //assigning values
        student1.rno = 12; //student1.rno means the rno variable of the student1 object
        student1.name = "sam";
        student1.marks = 92.7f;

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }

    //this is basically like a template - template is like a blueprint/outline
    //this template is basically like a set of rules
    //Class is like a logical construct

    //creating a class
    static class Student {
        int rno;
        String name;
        float marks;
        //this class contains 3 properties
    }
}

//we use dot operators (.) to link the object with its properties and methods

//The 'new' operator is used to create objects. It dynamically allocates memory and
//returns the reference to it at runtime
//Basically new does dynamic memory allocation


//JAVA IS A STATIC TYPED LANGUAGE