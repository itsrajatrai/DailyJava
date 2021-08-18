import java.util.*;  

class Rectangle{
    int length;
    int breadth;

    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }

    public int area(){
        int Area=length*breadth;
        return Area;  // Returning in JAVA
    }
}

public class ReturnInJava {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the Length- ");  
        int len=sc.nextInt(); 
        System.out.print("Enter the breadth- ");  
        int bre=sc.nextInt(); 

        Rectangle r=new Rectangle(len,bre);
        int ar=r.area();
        System.out.println(ar);
        sc.close();
        

    }
}
