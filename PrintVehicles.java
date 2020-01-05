//a function to print an array of vehicles


import java.util.ArrayList;

public class PrintVehicles {
    public static void main(String[] args){


        //a more complete program would create the arraylist in a separate class
        //where each item could be added in a try-catch block to confirm data validaton
        //the print function would be there and not a static function in the main driver

        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
        Vehicle c = new Car("c1", "mazda");
        vehicleArrayList.add(c);
        c = new Train("t1", 9);
        vehicleArrayList.add(c);
        c= new Car("c2", "fiat");
        vehicleArrayList.add(c);
        c = new Train("t2", 3);
        vehicleArrayList.add(c);
        c = new Car("c3", "bmw");
        vehicleArrayList.add(c);
        printList(vehicleArrayList);
    }

    public static void printList(ArrayList<Vehicle> list){
        for(Vehicle v : list){
            System.out.println(v.toString());
        }
    }

}
