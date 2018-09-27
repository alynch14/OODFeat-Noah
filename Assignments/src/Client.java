import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Temperature t1 = new Temperature();
        Temperature t2, t3, t4, t5;
        int fahrenheit;
        double celsius;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the temperature in fahrenheit: ");
        fahrenheit = getInt(input);

        System.out.println("Initializing the second temperature object...");
        t2 = new Temperature(fahrenheit);

        System.out.println("Please enter the temperature in Celsius: ");
        celsius = getDouble(input);

        System.out.println("Initializing the third temperature object...");
        t3 = new Temperature(celsius);

        System.out.println("Now initializing another temperature object with the two temperatures entered...");
        t4 = new Temperature(fahrenheit, celsius);

        System.out.println("Now initializing the final temperature object with the previous temperature object...");
        t5 = new Temperature(t4);

        System.out.println("Testing getters and setters:");
        System.out.printf("getFahrenheit on first object: %d\ngetCelsius on second object: %f\n", t2.getFarenheit(), t3.getCelsius());

        System.out.println("Please enter in another temperature for Fahrenheit: ");
        t3.setFarenheit(getInt(input));

        System.out.println("Please enter in another temperature for Celsius: ");
        t2.setCelsius(getDouble(input));

        System.out.println("After call to equals method on t2 and t3: ");
        if(t2.equals(t3)){
            System.out.println("The two temperatures are equal!");
        }
        else{
            System.out.println("The two temperatures are not equal.");
        }

        System.out.println("After call to equals method on t4 and t5: ");
        if(t4.equals(t5)){
            System.out.println("The two temperatures are equal!");
        }
        else{
            System.out.println("The two temperatures are not equal.");
        }

        System.out.println("Testing belowFreezing method: ");
        if(t4.belowFreezing()){
            System.out.println("It is freezing!");
        }
        else{
            System.out.println("It is not freezing.");
        }

        System.out.println("Finally, " + t5);
    }

    public static int getInt(Scanner in){
        while(!in.hasNextInt()){
            System.out.println("Please enter an integer value for your temperature: ");
            in.next();
        }
        return in.nextInt();
    }

    public static double getDouble(Scanner in){
        while(!in.hasNextDouble()){
            System.out.println("Please enter an integer value for your temperature: ");
            in.next();
        }
        return in.nextDouble();
    }
}
