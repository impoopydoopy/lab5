public class Person {
    private String surname;
    private String name;
    private int age;

    Person(String surname, String name, int age){
        this.surname = surname;
        this.name = name;
        if(age >= 0 && age <= 120) this.age = age;
        else this.age = 0;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 120) this.age = age;
        else this.age = 0;
    }

    public int getAge() {
        return age;
    }

    public void printInfo()
    {
        System.out.println("Человек " + surname + " " + name + ", возраст: " + age);
    }
}
