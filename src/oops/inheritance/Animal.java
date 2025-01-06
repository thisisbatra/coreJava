package oops.inheritance;

public class Animal {
    void sound(){
        System.out.println("i have some sound!");
    }
    public static void flexible(){
        System.out.println("i have some flexibility");
    }
}
class Cat extends Animal{
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
class Lion extends Animal{

}