package Geometry;

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