package com.introtojava.oopspracticeooptwo.staticeconcept;

public class Singleton {
    //it's a class where only one object can be created

    //whenever you call a constructor new object is created, so inorder to stop
    //creating more objects we need to block people from creating more objects
    //we need to stop calling constructors

    //so inorder to do so we need to make it private
    //private - means it will only be used in ths call

    private Singleton() {

    }

    //only need one instance - inorder to create only one instance
    private static Singleton instance; //static since we are not creating an object of this class
    //but are returning this object

    // function/method
    public static Singleton getInstance() {
        //check whether if only one object is created or not
        if (instance == null) {
            instance = new Singleton(); //creating an object
        }
        return instance;
    }
}
