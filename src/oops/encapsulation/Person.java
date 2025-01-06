package oops.encapsulation;

public class Person {
    //what is Encapsulation?
    //it is a mechanism of oops where data members of a class are binded(encapuslated) in a single entity,
    // which exist independently. It can be implemented in java by defining a class.
    // Real life example: medicine, kitchen, home whatever i think
    int age;
    String name;
    char sex;
    void setAge(int age){
        //here this keyword points the current reference!
         this.age=age;
    }
    int getAge(){
        return this.age;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setSex(char sex){
        this.sex=sex;
    }
    char getSex(){
        return this.sex;
    }
}
