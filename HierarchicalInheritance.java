/*
                Hierarchical Inheritance
                ------------------------
                
                           A
                           |
          -----------------------------------
          |                |                |
          B                C                D
 
*/
package OOPs;
class Fruit{
    public void fruit(){
        System.out.println("Fruit is: ");
    }
}
class Mango extends Fruit{
    public void mango(){
        System.out.println("Mango"+",");
    }
}
class Banana extends Fruit{
    public void banana(){
        System.out.println("Banana"+",");
    }
}
class Orange extends Fruit{

    public void orange(){
        System.out.println("Orange"+",");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mango A=new Mango();
        A.fruit();
        A.mango();
        Banana B=new Banana();
        B.fruit();
        B.banana();
        Orange C=new Orange();
        C.fruit();
        C.orange();
        
    }
}
