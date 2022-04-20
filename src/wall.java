public class wall {
    private double width;
    private double height;

    public wall(){
        this(10.0, 20.0);
    }
    public wall(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
