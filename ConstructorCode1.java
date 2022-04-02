     public class ConstructorCode1 {
        private int l,b,h;
        public ConstructorCode1(){
             l=10;
             b=8; 
             h=4;
        }
    
        public ConstructorCode1(int L, int B, int H)
         {
            l=L; 
            b=B; 
            h=H; }
    
        public static void main(String []args)
        {
           // ConstructorCode1 b1= new ConstructorCode1();
            ConstructorCode1 b2= new ConstructorCode1(20,15,5);
            System.out.println(ConstructorCode1.b2);
            
        }


    
}
