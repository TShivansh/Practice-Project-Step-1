class Thrd extends Thread1 {
    public void run(){
        System.out.println("Inside the Thread created from Thread Class");
    }
}

    public class Thread1{
        public static void main(String []args){
            Thread t1= new Thrd();
            t1.start(); //thread is assined to thread scheduler
        }
    }
    
