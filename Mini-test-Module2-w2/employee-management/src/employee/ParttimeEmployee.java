package employee;

public class ParttimeEmployee extends Employee {
    private int workHour;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(int workHour) {
        this.workHour = workHour;
    }

    public ParttimeEmployee(String id, String name, int age, String phoneNumber, String email, int workHour) {
        super(id, name, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    @Override
    public int getSalary() {
        int payroll = workHour * 100000;
        return payroll;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee {" +
                "name= " + super.getName() +
                ", ID= " + super.getId() +
                ", salary= " + getSalary() +
                '}';
    }

}
