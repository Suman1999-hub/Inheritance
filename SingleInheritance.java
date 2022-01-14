/*
    Single Inheritance
    -------------------
    
            A
       (Super Class)
            |
            |
            B
        (Sub Class)
*/
package OOPs;
import java.util.*;
class Name{
    public void print_Name(){
        System.out.print("Suman ");
    }
}
class Title extends name{
    public void print_Title(){
        System.out.print("Rana");
    }

}
public class SingleInheritance {
    public static void main(String[] args) {
        title s=new title();
        s.print_Name();
        s.print_Title();

    }
}
