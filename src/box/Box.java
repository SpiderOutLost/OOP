package box;

public class Box {
    private double length;
    private double width;
    private double heigths;

    public Box(double length, double width, double heigths) {
        this.length = length;
        this.width = width;
        this.heigths = heigths;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigths(double heigths) {
        this.heigths = heigths;
    }

    public Box(double size) {
        this(size,size,size);
    }

    public double Volume() {
        double volume = length * width * heigths;
        return volume;
    }
    public Box(Box another){
        this(another.length, another.width, another.heigths);
    }
    public void setDinens(double length, double width, double heigths) {
        this.length = length;
        this.width = width;
        this.heigths = heigths;
    }
    public Box copyBox (){
        Box box = new Box(this.length,this.width,this.heigths);
         return box;
}
    public Box increase(){
        Box box = new Box(this.length*this.length ,this.width*this.width,this.heigths*this.heigths);
        return box;
    }
    public int compare(Box another) {
        double currentVolume = Volume();
        double anotherVolume = another.Volume();
        if (currentVolume > anotherVolume) {
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        }
        return 0;
    }
}