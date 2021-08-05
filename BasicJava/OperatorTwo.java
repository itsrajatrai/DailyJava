// Implementation of Equality, Relational, and Conditional Operators in Java
public class OperatorTwo {
    public static void main(String args[]) {
        int a =45;
        int b=95;

        // Equality Operations & Relational Operations
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);

        //Conditional Operations
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
        System.out.println("value1 is 1 AND value2 is 2");
    if((value1 == 1) || (value2 == 1))
        System.out.println("value1 is 1 OR value2 is 1");

        // terniary Operator
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
