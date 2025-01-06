package oops.abstraction;
//what is abstraction?
//it is a mechanism of oops where only the necessary/relevent details will be shown/shared
// and other irrelevent/unecessary details are hidded/abstracted from the user.
//It can be achieved by implementing interface/abstract class, using access modifiers.

//real life example : to drive a car we onll need to know about race,gear,steering.
// we don't need to understand how the car engine works!

 abstract class vehicle{
     //concrete method : the function which has body inside abstract class
     void greet(){
         System.out.println("hello from vehicle!");
     }
     abstract void gearShift();
}
public class Car extends vehicle {

    @Override
    void gearShift() {
        System.out.println("it has 4 gear");
    }
}
class Bus extends vehicle{

    @Override
    void gearShift() {
        System.out.println("it has 6 gear");
    }
}
