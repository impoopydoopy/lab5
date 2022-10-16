public class Main {
    public static void main(String[] args) {
        Person university[] = new Person[5];

        Person tinkertrain = new Student("Osbourne", "Ozzy", 73, "AD-211", 9);
        Person holydiver = new Student("Dio", "Ronnie-James", 67, "AD-211", 19);
        Person trooper = new Student("Iron", "Maiden", 47, "AD-211", 2);

        Person painkiller = new Lecturer("Judas", "Priest", 53, "Heavy metal", 20000);
        Person elevatorman = new Lecturer("Oingo", "Boingo", 16, "New wave", 21000);

        university[0] = tinkertrain;
        university[1] = holydiver;
        university[2] = trooper;
        university[3] = painkiller;
        university[4] = elevatorman;

        for(Person p : university)
            p.printInfo();
    }
}