package employee;

public class FulltimeEmployee extends Employee {
    private int bonus;
    private int penalty;
    private int mainSalary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int bonus, int penalty, int mainSalary) {
        this.bonus = bonus;
        this.penalty = penalty;
        this.mainSalary = mainSalary;
    }

    public FulltimeEmployee(String id, String name, int age, String phoneNumber, String email, int bonus, int penalty, int mainSalary) {
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.mainSalary = mainSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getMainSalary() {
        return mainSalary;
    }

    public void setMainSalary(int mainSalary) {
        this.mainSalary = mainSalary;
    }

    @Override
    public int getSalary() {
        int payroll = mainSalary + (bonus - penalty);
        return payroll;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee {" +
                "name= " + super.getName() +
                ", ID = " + super.getId() +
                ", salary= " + getSalary() +
                '}';
    }

}
