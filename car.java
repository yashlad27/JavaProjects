import java.util.Locale;

public class car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("X1")||validModel.equals("Commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

        this.model = model; // updating an object
    }
    public String getModel(){
        return this.model;
    }
}
