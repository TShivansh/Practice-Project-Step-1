public class Example2 
{
    public static void main(String []args)
    {
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        s1.setRollno(100);
        s2.setRollno(100);
        s1.setName("Shivansh");
        s2.setName("Shiva");
        int age;
        age=s1.getAge();
        String s="";
        System.out.println(age);
        System.out.println("Rollno:" +s1.getRollno());
        System.out.println("Name:" +s1.getName());
        System.out.println("Age:" +s1.getAge());

    }
    
}
