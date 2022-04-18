interface Calcy1{
    void add();
}
interface Calcy2{
    void sub();
}
class Calculator implements Calcy1,Calcy2{
    @Override
    public void sub(){
        System.out.println("Inside sub");
    }
    @Override
    public void add(){
        System.out.println("Inside add");
}
}



public class Launch {
    public static void main (String []args){
        Calculator c1 = new Calculator();
        c1.add();
        c1.sub();
    }
}
