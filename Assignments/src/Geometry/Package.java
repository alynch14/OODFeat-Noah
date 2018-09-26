package Geometry;

public class Package implements Measurable {
    private int length;
    private int width;
    private int height;
    private int weight;
    private int surfaceArea;
    private int volume;

    public Package(int length, int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public String getMeasure() {
        return String.format("Length: %d\n Width: %d\n", length, width);
    }
}
