class Bike{
    private int gear;
    private static int noOfBike=0;

    public void display() {
        System.out.println("The number of gears : "+ gear);
        ++noOfBike;
        int num=numBike();
        System.out.println("The number of bikes : "+num);
    }

    public static int numBike(){
        return noOfBike;
    }

    Bike(){
        gear=45;
    }
    
}



public class StaticInJava {
    public static void main(String args[]) {
        Bike b=new Bike();
        Bike bi=new Bike();
        b.display();
        bi.display();
    }
}
