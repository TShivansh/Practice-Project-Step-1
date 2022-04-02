public class Cube {
    private int l,b,h;
    public void setDimension(int x,int y,int z ) //Instance member function
    {
        l=x;
        b=y;
        h=z;
    }
    
    
}
class Dimensions{
    public static void main(String[]args)   //static member function
{
    Cube c1 = new Cube();
    c1.setDimension(12,10,5);
    System.out.println(c1.setDimension);


}

}
