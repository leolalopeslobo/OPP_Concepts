package com.introtojava.oopspracticeooptwo.staticeconcept;

public class SingletonMain {
    public static void main(String[] args) {
        //error: since you cant call a private constructor

        Singleton obj1 = Singleton.getInstance();//static declared since we are accessing it via the class name\
        //hence, its not dependent on object creation

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();
    }
}

//all 3 ref variables are pointing to the same object