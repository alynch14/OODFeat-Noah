package Geometry;

public class Measurements {
    public String Measurements(Object m) throws UnsizedException
    {
        Class name=m.getClass();
        String string = null;
        if (m instanceof StringBuffer) {
            string= m+ " characters";
        }
        else if (m instanceof Sized){
            if(m instanceof StudentRecords){
                string= " ";
            }
            else if(m instanceof SemesterSchedule){
                string = " ";
            }
            else if(m instanceof Department){
                string = m+ " credits";
            }
            else if(m instanceof Sized && m instanceof Building){
                string = m+ " square feet";
            }
        }
        else {
            throw new UnsizedException("ERROR");
        }
        return string;
    }
}
