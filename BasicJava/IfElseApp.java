// This program is an implementation of the If-Else Conditional Statements.
public class IfElseApp{
    public static void main(String[] args) {
        int grade=30;
        if(grade>=90){
            System.out.println("You have got A grade");
        }
        else if(grade>=80){
            System.out.println("You have got B grade");
        }
        else if(grade>=70){
            System.out.println("You have got C grade");
        }
        else if(grade>=40){
            System.out.println("You are Pass");
        }
        else{
            System.out.println("You have got Failed");
        }
    }
}