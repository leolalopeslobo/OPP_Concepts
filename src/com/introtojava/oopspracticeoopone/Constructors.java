package com.introtojava.oopspracticeoopone;

public class Constructors {
    //A Constructor basically defines what happens when an object is created
    //A Constructor is used to instantiate (assign values) an object

    //Constructor is a special function that runs when you create an object, and it allocates some variables

    public static void main(String[] args) {

        Student student1 = new Student();

        // ALL THE ASSIGNING VALUES IN THE MAIN FUNCTION MANUALLY CAN BE SKIPPED
        // BY USING CONSTRUCTORS THAT ALLOW TO TAKE IN VALUES WHILE CREATING AN OBJECT

//        //assigning values
//        student1.rno = 12; //student1.rno means the rno variable of the student1 object
//        student1.name = "sam";
//        student1.marks = 92.7f;

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        student1.changeName("naughty dino");
        student1.greeting();

        Student student2 = new Student(student1);
        System.out.println(student2.name);


        Student student3 = new Student("this is a constructor");

        //calling a constructor from another constructor
        Student callingconstfromconstruct = new Student();
        System.out.println(callingconstfromconstruct.name);
    }

    //we need a way to add the values of the above properties object by object
    //hence we need one word (keyword) to access every object
    //this keyword automatically sets the reference variable to the value assigned in the constructor
    //This is done using the 'this' keyword

    static class Student {
        int rno;
        String name;
        float marks;

        //creating a constructor
        Student (String sent) {
            //no need of defining a return type or name, the return type is the class itself
            //because it is going to create a type of the object of this class
            this.rno = 64;
            this.name = "max";
            this.marks = 91.3f;
            //if same variable name when taking parameter at creating of object use 'this'
            System.out.println(sent);
        }

        //'this' keyword is basically used to avoid confusion when deciding which variable to use

        Student (int roll_no, String naam, float score) {
            rno = roll_no;
            name = naam;
            marks = score;
            //if different variables name when taking parameter then no need of 'this' keyword
        }

        //creating methods
        void greeting() {
            System.out.println("hey! i am "+this.name);
        }

        void changeName(String newName) {
            name = newName;
        }

        //empty constructor
        Student () {
            //this is how you call a constructor from another constructor
            //internally: new Student();
            //Internally it is like -> new Student (13,"defalut person",88.2f);
            this (13,"defalut person",88.2f);
        }

        //creating constructor to take value from another object
        Student (Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }
        //Constructors do not have a return type since thr type of the class is the return type
    }
}
