import java.lang.reflect.Constructor;

public class default constructor {
    int a; String b; boolean c;
    default constructor(){
        a=100; b="jani";c=true;
    }
    void display(){
        System.out.println(a+" "+b+" " +c);
    }
}
class C{
    default Constructor dc=new default constructor();
    dc.display();
}
