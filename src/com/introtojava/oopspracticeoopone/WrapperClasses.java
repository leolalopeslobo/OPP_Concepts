package com.introtojava.oopspracticeoopone;

public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10; //primitive

        Integer num = 11; //created as an object
        //here num is a reference variable
        //this is a wrapper class

        System.out.println(num.compareTo(a));
        //using Wrapper Classes we also get to use the various members present in it


        final A stud = new A("kcool");
        stud.name = "fantastic";

        //when a non-primitive is final, you cannot reassign it
        //stud = new A("im tried i need some rest");


        final A jacob =  new A("new name");
        jacob.name = "another name";

        /*
        //when a non-primitive is final, you cannot reassign it
        jacob = new A("new object name");
        */



        //demo of finalise
        A obj;

        for (int i = 0; i < 100000000; i++) {
            obj = new A("new name");
            //creating objects that use the same reference variable

            //we know that no more than one object can point to the same reference variable
        }
    }
}

class A {
    final int num = 5;
    String name;

    public A (String name) {
        System.out.println("Object Created");
        this.name = name;
    }

    //we can have this final method inside class A, so whenever any object of class A is freed from the memory
    //the finalise method will be called
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
//Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
//where primitive types cannot be used (the list can only store objects)



// 'final' keyword
//it allows us to deny the content from being modified
//its used to create constant

// final int INCREASE;
// final variables need to be initialised while declaring it
//why? you can't modify it hence always initialise while declaring it
//because you can't really change it

//Unfortunately final guarantees that this immutability only when the instance variables are primitive
//and not the reference types of objects because if the instance variable of a reference type has a final
// modifier behind it the value of that instance variable will never change,
// the reference to the object will never change, it will always refer to the same object, but the value of the object will change

// -------------------------------------------------------------------
//final Student jaocb = new Student();
//jacob.name = "new name";
// -----jacob = other object--------  ->  //this is not allowed
//--------------------------------------------------------------------


//you cannot make a change in the value when its of primitive datatype
//if non-primitive then you can make the change in the value, but you cannot reassign it


//---------------
//Garbage Collector
/* This is done automatically in JAVA.
in java, we cannot control when the garbage collector will hit, but wat we can do is specify what to do
when it does by using the 'finalise' key word, but you cannot destroy the object manually
finalise is kind of a destructor, it will be called when java is doing Garbage Collection
 */
//---------------