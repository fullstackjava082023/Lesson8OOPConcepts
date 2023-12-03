import java.time.LocalDate;

public class Manager extends Employee {
    private double bonus =0;



    //constructor
    public Manager (double salary, String name, int year, int month, int day) {
        super(salary, name ,year, month, day);

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return super.toString() + " bonus is: " + this.bonus;
    }
}
