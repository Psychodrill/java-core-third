import java.time.LocalDate;

public class Employee {

    private static final int CURRENT_YEAR = LocalDate.now().getYear();
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    int birth;

    public Employee(String name, String midName, String surName,
    String phone, String position, int salary, int birth) {
    this.name = name;
    this.midName = midName;
    this.surName = surName;
    this.position = position;
    this.phone = phone;
    this.salary = salary;
    this.birth = birth;
    }
    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }
    // public void increaseSalary(int amount){
    //     this.salary+=amount;
    // }

    static public boolean compareDates(LocalDate firstDate, LocalDate secondDate){

        return firstDate.isBefore(secondDate);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s - %s", this.name, this.salary);
    }

}