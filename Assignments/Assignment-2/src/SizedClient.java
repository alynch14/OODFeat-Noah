import Geometry.Sized;
import Geometry.SemesterSchedule;
import Geometry.StudentRecords;
import Geometry.Building;
import Geometry.UnsizedException;
import Geometry.Department;
public class SizedClient {
    public static void main(String args[]){
        StudentRecords a=new StudentRecords("1");
        Building b=new Building("2");
        SemesterSchedule c=new SemesterSchedule("3");
        Department d=new Department("4");

        System.out.println(a.getSize());
        System.out.println(b.getSize());
        System.out.println(c.getSize());
        System.out.println(d.getSize());
    }
}
