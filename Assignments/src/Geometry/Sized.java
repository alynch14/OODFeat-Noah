package Geometry;

public interface Sized {
    default String getSize() {
        return null;
    }
    Sized StudentRecords();
    Sized SemesterSchedule();
    Sized Department();
    Sized Building();
}
