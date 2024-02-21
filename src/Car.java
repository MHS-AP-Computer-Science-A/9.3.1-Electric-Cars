public class Car {

    //This code is complete
    private String model;
    private int mpg;

    public Car(String model, int mpg){
        this.model = model;
        this.mpg = mpg;
    }

    public String getModel(){
        return model;
    }

    public String getEfficiency(){
        return model + " gets " + mpg + " mpg.";
    }
}
