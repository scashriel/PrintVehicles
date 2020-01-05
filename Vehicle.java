//an interface for vehicles

public abstract class Vehicle {

    private final String vNumber;

    //constructor
    public Vehicle(String vNumber){
        this.vNumber = vNumber;
    }

    public String getVNumber(){
        return this.vNumber;
    }

    @Override
    public String toString() {
        return String.format("Vehicle Number is: %s", this.vNumber);
    }
}
