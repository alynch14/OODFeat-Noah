package Geometry;

public class SemesterSchedule implements Sized {
    String sized;

    public SemesterSchedule (String inSize) {
        this.sized = inSize;
    }

    @Override
    public String getSize() {
        return sized;
    }
}
