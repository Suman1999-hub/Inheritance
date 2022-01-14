package OOPs;
import java.util.*;
class name{
    public void print_Name(){
        System.out.print("Suman ");
    }
}
class title extends name{
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
