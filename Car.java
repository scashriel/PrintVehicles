//a class defining cars


public class Car extends Vehicle {


    private Model model;

    //constructor
    public Car(String vNumber, String model){
        super(vNumber);
        setModel(model);
    }

    public Model getModel() {
        return this.model;
    }

    public void setModel(String model) {
        try{
            this.model = Model.valueOf(model.toUpperCase());
        }
        catch(Exception e){
            System.out.println("This is not a valid model from our database");
        }
        finally {
            this.model = Model.valueOf(model.toUpperCase());
        }
    }

    @Override
    public String toString() {
        return String.format("Car number %s is a %s", this.getVNumber(), this.getModel());
    }
}
