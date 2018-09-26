public class Temperature {
    private int farenheit;
    private double celsius;

    public Temperature(){
        farenheit = 0;
        celsius = 0.0;
    }

    public Temperature(int farenheit){
        this.farenheit = farenheit;
        celsius = (double) (farenheit-32)*5/9;
    }

    public Temperature(double c){
        celsius = c;
        farenheit = (int) c*9/5+32;
    }

    public Temperature(int f, double c){
        farenheit = f;
        celsius = c;
    }

    public Temperature(Temperature temp){
        farenheit = temp.farenheit;
        celsius = temp.celsius;
    }

    public int getFarenheit(){
        return farenheit;
    }

    public double getCelsius(){
        return celsius;
    }

    public void setFarenheit(int tempF){
        farenheit = tempF;
    }

    public void setCelsius(double tempC){
        celsius = tempC;
    }

    @Override
    public String toString(){
        return String.format("The temperature is:\nFarenheit: %d\nCelsius: %f\n", farenheit, celsius);
    }

    public boolean belowFreezing(){
        return (farenheit <= 32 || celsius <= 0.0);
    }

    @Override
    public boolean equals(Object otherTemp){
        return (otherTemp.getClass() == Temperature.class) && (farenheit == new Temperature((Temperature)otherTemp).farenheit && celsius == ((Temperature)otherTemp).celsius);
    }
}