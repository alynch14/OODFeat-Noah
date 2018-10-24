package Geometry;

public class Building implements Sized {
    String sized;

    public Building(String inSize) {
        this.sized = inSize;
    }

    @Override
    public String getSize() {
        return sized;
    }
}
