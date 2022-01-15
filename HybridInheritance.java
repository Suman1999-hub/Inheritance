package OOPs;
class Grandfather{
    public void printGrandfatherName(){
        System.out.println("Sudhanshu Rana");
    }
}
class Father extends Grandfather{
    public void printFatherName(){
        System.out.println("Surajit Rana");
    }
}
class Me extends Father{
    public void printMyName(){
        System.out.println("Suman Rana");
    }
}
class Sister extends Father{
    public void printSisterName(){
        System.out.println("No Sister is Present");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Me s=new Me();
        s.printGrandfatherName();
        s.printFatherName();
        s.printMyName();
        Sister s1=new Sister();
        s1.printGrandfatherName();
        s1.printFatherName();
        s1.printSisterName();
    }
}
