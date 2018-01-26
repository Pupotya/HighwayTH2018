package lesson8;

public class HeavyBox extends Box {

    int weight;

    public void printInfo(){
        System.out.println(getVolume());
        System.out.println(getVolume());
    }


    public HeavyBox(double width,double height,double depth,int weight){
        super(width, height, depth);
        this.weight = weight;

    }
}
