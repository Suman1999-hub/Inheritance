package OOPs;
interface father{
    public void printFatherName();
}
interface mother{
    public void printMotherName();
}
interface me extends father,mother{
    public void printMyName();
}
class child implements me{
    @Override
    public void printFatherName() {
        System.out.print("Surajit Rana");
    }

    @Override
    public void printMotherName() {
        System.out.print("Pranati Rana");

    }

    @Override
    public void printMyName() {
        System.out.print("Suman Rana");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        child s=new child();
        s.printFatherName();
        s.printMotherName();
        s.printMyName();
    }
}
