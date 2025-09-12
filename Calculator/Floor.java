public class Floor {
    private double width;
    private  double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        if(width < 0){
            width = 0;
        }else if(length < 0){
            length = 0;
        }
        return width*length;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
