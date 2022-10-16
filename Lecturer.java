public class Lecturer extends Person{
    private  String department;
    private double salary;

    Lecturer(String surname, String name, int age, String department, double salary){
        super(surname, name, age);
        this.department = department;
        if(salary > 0)
            this.salary = salary;
        else this.salary = 10000.0;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        if(salary > 0)
            this.salary = salary;
        else this.salary = 10000.0;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Преподаватель кафедры " + department + " " + super.getSurname() + " " + super.getName() + ", возраст: " + super.getAge() + "\nЗарплата: " + salary);
    }
}
