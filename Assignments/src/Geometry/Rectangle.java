package Geometry;

public class Rectangle implements Measurable {
    int weightOZ, weightLBS;
    public  Rectangle(int weightLBS, int weightOZ) {
        this.weightLBS = weightLBS;
        this.weightOZ = weightOZ;
    }
    @Override
    public String getMeasure() {
        return String.format("Pounds: %d\n Ounces: %d\n", weightLBS, weightOZ);
    }
}