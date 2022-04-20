package com.introtojava.oopspracticeooptwo.staticeconcept;

public class Main {
    public static void main(String[] args) {
        //creating an object
        Human jonah = new Human(29,"Jonah",100000,false);
        Human nick = new Human(32,"Nick",200000,true);

        System.out.println(jonah.population);
        System.out.println(nick.population);
    }


    //One of the most common static methods is 'public static void main'
    /*
    Static lets us use the main function or method without creating a main object
    main is the very first thing that is run when you run java program


    inorder to run anything inside a class you need to create and object of that class
    but how can you run the program to create an object if main is the very first thing that is running
    hence we should be able to run main without creating an object of the class in which main is,
    hence 'static' is used
     */

    //these static properties and methods actually only belong to the class and not to the object
}
