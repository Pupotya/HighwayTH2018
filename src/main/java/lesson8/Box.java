package lesson8;

public class Box {


    public String name = "";

    public Box(double width, double height,double depth,String name) {
        this(width,height,depth);
        this.name = name;
    }

    public double width;
    public double height;
    public double depth;

    public String getVolume() {
        return "KOROBKA:" + (width * height * depth);
    }

    public void printInfo() {
        System.out.println("Box size" + getVolume());
    }

    public Box() {
        width = 10;

        height = 10;

        depth = 10;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = depth;
        this.depth = depth;

    }

    public Box (double depth) {
        this.depth = depth;
    }


}
