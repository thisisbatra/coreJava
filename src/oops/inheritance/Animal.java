package oops.inheritance;

public class Animal {
    //here animal class has two methods one of them is static
    void sound(){
        System.out.println("i have some sound!");
    }
    public static void flexible(){
        System.out.println("i have some flexibility");
    }
}
class Cat extends Animal{
    //after inherited animal class we can access the data members as well as data methods inside child scope.
    //methods inherited will be depend on what type of modifier is used.
    //here sound method is overrided as both parent and child has same method which share same signature.
    void sound(){
        System.out.println("people says i meow");
    }
    public static void flexible(){
        System.out.println("i am more flexible than dog");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("people says i bark");
    }
    public static void flexible(){
        System.out.println("i am less flexible than cat");
    }
}