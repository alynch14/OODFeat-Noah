package Geometry;

public class Measurements {
    public String Measurements(Object m) throws UnsizedException
    {
        Class name=m.getClass();
        String string = null;
        if (m instanceof StringBuffer) {
            string= "16 characters";
        }
        else if (m instanceof Sized){
            if(m instanceof StudentRecords){
                string= " ";
            }
            else if(m instanceof SemesterSchedule){
                string = " ";
            }
            else if(m instanceof Department){
                string = "16 credits";
            }
            else if(m instanceof Sized && m instanceof Building){
                string = "8560 square feet";
            }
        }
        else {
            throw new UnsizedException("ERROR");
        }
        return string;
    }
}
