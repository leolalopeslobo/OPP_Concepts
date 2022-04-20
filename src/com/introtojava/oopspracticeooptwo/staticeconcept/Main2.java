package com.introtojava.oopspracticeooptwo.staticeconcept;

public class Main2 {
    public static void main(String[] args) {

        //greeting(); // -> error: since not-static method

        //here the object that is created for fun2 will also bind and create an object for greeting to when called
        Main2 funn = new Main2();
        funn.fun2();

    }

    //this is not dependent on objects
    static void fun(){
        //greeting();  //you cannot use this because it requires an instance
        //but the function you are using it in does not depend on instances

        //or
        //you can access non-static stuff w/o referencing their instances in static context
        //hence, here it is being referenced
        Main2 obj = new Main2();
        obj.greeting();
    }


    void fun2 () {
        greeting();
        System.out.println("this ran");
    }


    //we know that something which is not static, belong to an object
    void greeting() {
        System.out.println("static concept should be crystal clear");
        fun(); //static inside a non-static is allowed
    }
}



/* inside a static method we cannot use anything that is not static
 a static method cannot access a non-static method
 since non-static data actually belong to an instance (object)
 in non-static it is unable to resolve which instance of a class is referred to
 while in static there is no instance!
 hence without specifying which instance the non-static method/property belongs to it cannot be used
 */


// in the end, everything will be called by a static method i.e. main method
