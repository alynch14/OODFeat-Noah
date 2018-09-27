public class SingletonClient {

    public static void main(String[] args){
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();

        System.out.println("Singleton 1: " + singleton1);
        System.out.println("Singleton 2: " + singleton2);

        if(singleton1.equals(singleton2)){
            System.out.println("These classes are singleton.");
        }
        else{
            System.out.println("No");
        }
    }
}
