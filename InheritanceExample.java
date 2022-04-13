class Plane
{
    void takeOff(){
        System.out.println("Plane tookoff");

    }
    void fly(){
        System.out.println("Plane is flying");
        
    }
    void land(){
        System.out.println("Plane landed");

    }
}
class CargoPlane extends Plane{
    @Override
    void fly(){
        System.out.println("Plane is flying in low heights");
    }
}
class FighterPlane extends plane{
    @Override
    void fly(){
        System.out.println("Plane is flying in great heights");
    }
}
public class InheritanceExample {
    public static void main(String[] args){
        cargoPlane cp = new CargoPlane();
    }
    
}
