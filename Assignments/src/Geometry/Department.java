package Geometry;

public class Department implements Sized {
    String sized;

    public Department (String inSize) {
        this.sized = inSize;
    }

    @Override
    public String getSize() {
        return sized;
    }
}