// Implementation of Assignment, Arithmetic, and Unary Operators in Java
/* 
*Author @ Rajat 
*Date 03 August 2021
*/

public class JavaOperators {
    public static void main(String[] args) {
        // Assignment Operator

        int daysOfWeek=7;  // Assigning the value of 7 in the variable daysOfWeek
        System.out.println(daysOfWeek);  

        // Arithmetic Operators
        int var1=45;
        int var2=78;

        int div=var2/var1;
        int mul=var1*var2;
        int add=var1+var2;
        int sub=var2-var1;
        int mod=var2%var1;

        System.out.println(div+" Divison ");
        System.out.println(mul+" Multiplication ");
        System.out.println(add+" Addition ");
        System.out.println(sub+" Subtraction ");
        System.out.println(mod+" Modulus ( Remainder Operation ) ");

        //Unary Operators in Java

        int result = 5;
        boolean value=true;
        System.out.println(+result);
        System.out.println(-result);
        System.out.println(++result);
        System.out.println(result++);
        System.out.println(--result);
        System.out.println(result--);
        System.out.println(!value);

    }
}
