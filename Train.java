//a class defining trains

public class Train extends Vehicle {
    private int numOfCars;

    //constructor
    public Train(String vNumber, int numOfCars){
        super(vNumber);
        if(numOfCars < 0){
            throw new IllegalArgumentException("Cannot have a negative number of cars");
        }
        this.numOfCars = numOfCars;
    }

    public int getNumOfCars() {
        return this.numOfCars;
    }

    public void setNumOfCars(int numOfCars) {
        if(numOfCars < 0){
            throw new IllegalArgumentException("Cannot have a negative number of cars");
        }
        this.numOfCars = numOfCars;
    }

    @Override
    public String toString() {
        return String.format("Train number %s has %d cars", this.getVNumber(), this.getNumOfCars());
    }
}
