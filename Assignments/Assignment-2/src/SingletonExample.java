public class SingletonExample {
    private int numberOfObjects = 0;
    private String str;
    private static SingletonExample ourInstance = new SingletonExample();

    public static SingletonExample getInstance() {
        return ourInstance;
    }

    private SingletonExample() {
        numberOfObjects++;
        str = "There are " + numberOfObjects + " instances of this object created.";
    }

    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString(){
        return str;
    }
}
