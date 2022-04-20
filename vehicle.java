public class vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer(): steering at "+currentDirection+" degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity=velocity;
        currentDirection=direction;

        System.out.println("Vehicle.move() moving at "+currentVelocity+" in direction "+currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity=0;
    }
}

class car1 extends vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public car1(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to "+this.currentGear+" gear.");
    }
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("car.changeVelocity(): velocity "+speed+" direction "+direction);
    }
}

class outlander extends car1{
    private int roadServiceMonths;

    public outlander( int roadServiceMonths) {
        super("Outlander", "4WD",  5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void Acclerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if(newVelocity==0){
            stop();
        }
        else if(newVelocity>0 && newVelocity<=10){
            setCurrentGear(1);
        }else if(newVelocity>10 && newVelocity<=20){
            setCurrentGear(2);
        }else if(newVelocity>20 && newVelocity<=30){
            setCurrentGear(3);
        }else{
            setCurrentGear(4);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}


