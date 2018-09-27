package Geometry;

public class Rectangle implements Measurable {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public String getMeasure() {
        return String.format("Length: %d\n Width: %d\n", length, width);
    }

}
