public class MultidArraysInJava {
    public static void main(String[] args) {
        String[][] names={
            {"Mr.","Mrs.","Miss."},
            {"Ramesh","Pooja","Smitha","George","Alex"}
        };

        System.out.println(names[0][0]+names[1][0]); //For Mr. Ramesh
        System.out.println(names[0][2]+names[1][1]); // For Miss. Pooja

        // to print the length of the arrays
        System.out.println(names.length);
    }
}
