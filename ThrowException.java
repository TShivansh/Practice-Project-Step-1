class Code{
    void opr()  throw ArithmeticException //ducking of exception
    {
        int a=45,b=0,rs;
        if(b=0)
        throw(new ArithmeticException("Can't divide by zero"));
        else
        {
            rs = a/b;
            System.out.print("\n\t The result is:" +rs);
        }
        System.out.print("\n\t End of program.:");

    }

    public class ThrowException{
        public static void main(Strin[]args){

            code c= new Code();

            try{
                c.opr(); // critical statement
            }

            catch (ArithmeticException e){
                System.out.print("from main printing:" +e.getMessage());
            }
        }
    }
    
}
