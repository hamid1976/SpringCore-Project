class MyClass implements Cloneable {
    private int intValue;
    private String stringValue;

    public MyClass(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // Getter and Setter methods...

    // Override the clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object
        MyClass originalObject = new MyClass(42, "Hello");

        try {
            // Clone the object
            MyClass clonedObject = (MyClass) originalObject.clone();

            // Now, originalObject and clonedObject are two separate objects with the same state
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
