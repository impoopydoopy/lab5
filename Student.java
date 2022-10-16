public class Student extends Person{
    private String group;
    private int ticketNumber;

    Student(String surname, String name, int age, String group, int ticketNumber){
        super(surname, name, age);

        this.group = group;

        if(ticketNumber > 0 && ticketNumber < 100)
             this.ticketNumber = ticketNumber;
        else this.ticketNumber = 1;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setTicketNumber(int ticketNumber) {
        if(ticketNumber > 0 && ticketNumber < 100)
             this.ticketNumber = ticketNumber;
        else this.ticketNumber = 1;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Студент группы " + group + " " + super.getSurname() + " " + super.getName() + ", возраст: " + super.getAge() + ". \nНомер студ. билета: " + ticketNumber);
    }
}
