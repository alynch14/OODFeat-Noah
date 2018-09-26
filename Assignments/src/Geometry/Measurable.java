package Geometry;

public interface Measurable {
    public String getMeasure();
}
public class Rectangle implements Measurable {
    Double weightOZ, weightLBS;
    public void Rectangle(Double weightLBS, Double weightOZ) {
        this.weightLBS = weightLBS;
        this.weightOZ = weightOZ;
    }
    @Override
    public String getMeasure() {
        return "Weight: "+weightLBS+"lbs, "+weightOZ+"oz";
    }
}
class Package implements Measurable {
    Double length, width;
    public Package(Double length, Double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public String getMeasure() {
        return "Length: "+length+", Width: "+ width;
    }
}
class WindSpeed implements Measurable{
    Double speed;
    public WindSpeed(Double speed){
        this.speed=speed;
    }
    @Override
    public String getMeasure() {
        return "Speed: "+speed;
    }
}