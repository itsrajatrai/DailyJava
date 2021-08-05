public class ForLoopInJava {
    public static void main(String args[]) {  // General form of For loop
        for ( int a=0;a<11;a++){
            System.out.println("The Count is :"+ a);
        }

        int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);  // Iteration through Collections and arrays
         }
    }
}
