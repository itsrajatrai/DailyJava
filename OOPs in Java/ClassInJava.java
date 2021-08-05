// Method of another class accessed in the main class.
class Bicycle{
    int bicno=45;
    public void Display(){
        System.out.println(bicno);
    }
}


public class ClassInJava {
    public static void main(String[] args) {
        Bicycle b =new Bicycle();
        b.Display();
    }
}
