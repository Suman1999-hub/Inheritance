package OOPs;
class Name{
    public void name(){
        System.out.print("Suman"+" ");
    }
}
class MiddleName extends Name{
    public void middle(){
        System.out.print("Kumar"+" ");
    }
}
class Title extends MiddleName{
    public void title(){
        System.out.print("Rana");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Title s=new Title();
        s.name();
        s.middle();
        s.title();

    }
}
