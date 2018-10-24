package Geometry;

public class StudentRecords implements Sized{
    String sized;

    public StudentRecords(String inSize) {
        this.sized = inSize;
    }

    @Override
    public String getSize() {
        return sized;
    }
}
