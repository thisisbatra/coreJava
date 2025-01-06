package oops.encapsulation;

public class Driver {
    //this Driver class is in the same package as of Person thats why we can use default methods..
    //details will be discuss while revsing packages!
    public static void driver(){
        //static method cannot access members of a class, they can only access static members
        // as they using shared memory.
        Person p=new Person();
        p.setAge(26);
        p.setName("nitin");
        p.setSex('m');
        System.out.println("name:\t"+p.getName());
        System.out.println("age:\t"+p.getAge());
        System.out.println("sex:\t"+p.getSex());
    }
}
