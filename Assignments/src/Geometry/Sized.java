package Geometry;

public interface Sized {
    public String getSize();
}

    class StudentRecords implements Sized {
        String sized;

        public StudentRecords(String inSize) {
            this.sized = inSize;
        }

        @Override
        public String getSize() {
            return sized;
        }

    }
    class SemesterSchedule implements Sized{
        String sized;

        public SemesterSchedule (String inSize) {
            this.sized = inSize;
        }

        @Override
        public String getSize() {
            return sized;
        }
    }
    class Department implements Sized {
        String sized;

        public Department (String inSize) {
            this.sized = inSize;
        }

        @Override
        public String getSize() {
            return sized;
        }
    }
        class Building implements Sized {
            String sized;

            public Building(String inSize) {
                this.sized = inSize;
            }

            @Override
            public String getSize() {
                return sized;
            }
        }
    class UnsizedException extends Exception {
        String sized;

        public UnsizedException (String message){
         System.out.println("Error message");
        }
    }
