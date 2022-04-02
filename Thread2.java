class Thrd2 implements Runnable {
    public void run(){
        System.out.println("Inside the Thread created from Runnable Interface");
    }
    
}

public class Thread2 {
    public static void main(String[]args){
        Thrd2 t2= new Thrd2();
        Thread t= new Thread(t2);
        t.start();
    }
}
