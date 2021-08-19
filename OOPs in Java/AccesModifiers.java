class Demo{
    private int a;
    public Demo(){
        this.a=45;
    }

    public void Display()
    {
        System.out.println(a);
    }
}
public class AccesModifiers {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.a); // Error as Private field won't be accessed
        d.Display();
     
        
    }
    }