package Module1_Level3;
public class Cars {
    private String color;
    private String model;

    public Cars(){
        this.color = color;
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void startCar() {
        System.out.println("Start");
    }

    public void stopCar() {
        System.out.println("Stop");
    }

}
