package Geometry;

public class WindSpeed implements Measurable {
    private int speed;
    private int distance;
    private int timeInSeconds;

    public WindSpeed(double v){
        speed = 0;
        distance = 0;
        timeInSeconds = 0;
    }

    public WindSpeed(int d, int t){
        distance = d;
        timeInSeconds = t;
        speed = distance/timeInSeconds;
    }

    @Override
    public String getMeasure() {
        return String.format("The wind's current speed is %d", speed);
    }
}
