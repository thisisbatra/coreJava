package misc;

public class ObjectBehave {

    public static void main(String[] args) {
        //basic diff in == & equals()
        //== checks the refernce as well as content
        //equals checks only content
        //equals method is overridded by String class still works as same.
        //will explore equals method in details while revising java collection framework.
        Integer a=5,b=a;
        String str1="ajay";
        String str2="ajay";
        String str3=new String("ajay");
        System.out.println(a==b); //true
        System.out.println(a.equals(b)); //true
        System.out.println(str1==str2); //true
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1==str3); //false
        System.out.println(str1.equals(str3)); //true

        //comapreTo(present in comparable interface) &
        // compare(present in comparator) methods
        str2="ajay";str1="nitin";
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
    }
}