// package L1Object;

public class Student {
    int roll;
    String name;
    double perc;

    public Student(int roll, String name, double perc) {
        this.roll = roll;
        this.name = name;
        this.perc = perc;
    }

    public void display() {
        System.out.println(roll + " " + name + " " + perc);
    }
}
