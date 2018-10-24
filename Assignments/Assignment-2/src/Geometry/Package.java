package Geometry;

public class Package implements Measurable {
    int weightOZ, weightLBS;
    public  Package(int weightLBS, int weightOZ) {
        this.weightLBS = weightLBS;
        this.weightOZ = weightOZ;
    }
    @Override
    public String getMeasure() {
        return String.format("Pounds: %d\n Ounces: %d\n", weightLBS, weightOZ);
    }
}