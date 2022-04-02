class Hello1{
    int x;                  //Instance variable
    private static int y;   // static member variable
    
   // public void fun1() {  }           // instance member function
   // public static void fun2() {  }    // static member function

    static class Test{
        public static String country="INDIA";
    }
}

public class Rough{
    public static void main(String[] args){
    
        System.out.println(Hello1.Test.country);

    }
    
}
