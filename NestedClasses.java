// Object Creation of Nested Classes

class Human{
    int age;

    Human(int a)
    {
        this.age=a;
    }
    public void Display()
    {
        System.out.println("The Age of the Human is "+age);

    }

    class Me{
        int age;
        Me(int a)
        {
            this.age=a;

        }
        public void Display()
    {
        System.out.println("The Age of Mine is "+age);

    }
    }
}

public class NestedClasses {
    public static void main(String args[]) {
        Human h=new Human(100);
        Human.Me m =h.new Me(18);
        h.Display();
        m.Display();
    }
}
