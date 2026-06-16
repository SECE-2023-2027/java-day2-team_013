public class InitializationDemo {

    int number;
    double marks;
    boolean status;
    String name;

    public void display() {
        System.out.println("number = " + number);
        System.out.println("marks = " + marks);
        System.out.println("status = " + status);
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {

        InitializationDemo obj = new InitializationDemo();
        obj.display();

        // Local variable
        int localVar;

        // Uncomment the next line to see compiler error
        // System.out.println(localVar);

        localVar = 100;
        System.out.println("localVar = " + localVar);
    }
}