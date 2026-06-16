public class FieldNamesDemo {


    int age = 21;
    String studentName = "Dharanya";
    double salary_amount = 100000;
    boolean isActive = true;

    public static void main(String[] args) {
        FieldNamesDemo obj = new FieldNamesDemo();

        System.out.println("Age: " + obj.age);
        System.out.println("Name: " + obj.studentName);
        System.out.println("Salary: " + obj.salary_amount);
        System.out.println("Active: " + obj.isActive);
    }
}