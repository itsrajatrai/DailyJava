// Using this keyword in Java.
import java.util.*;  
class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void display(){
        System.out.println("The value of x= "+x+"\nThe value of y= "+y);
    }
}

public class ThisInJava{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the value of X: ") ;
        int pointx= sc.nextInt();
        System.out.println("Enter the value of Y: ");
        int pointy=sc.nextInt();

        Point p=new Point(pointx,pointy);
        p.display();

        sc.close();
    } 
}

