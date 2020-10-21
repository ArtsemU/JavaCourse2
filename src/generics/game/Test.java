package generics.game;

public class Test {
    public static void main(String[] args) {
        Scoolar scoolar1 = new Scoolar("Maya", 15);
        Scoolar scoolar2 = new Scoolar("Nika", 14);

        Student student1 = new Student("John", 20);
        Student student2 = new Student("Mike", 18);

        Employee employee1 = new Employee("L", 27);
        Employee employee2 = new Employee("Zero", 31);

        Team<Scoolar> shollarTeam = new Team<>("Stars");
        shollarTeam.addNewParticipant(scoolar1);
        shollarTeam.addNewParticipant(scoolar2);

        Team<Student> studentTeam = new Team<>("Zibra");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Plankton");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Scoolar scoolar3 = new Scoolar("Pyatro", 15);
        Scoolar scoolar4 = new Scoolar("Myahno", 14);
        Team<Scoolar> shollarTeam2 = new Team<>("Selen");
        shollarTeam2.addNewParticipant(scoolar3);
        shollarTeam2.addNewParticipant(scoolar4);

        shollarTeam2.playWith(shollarTeam);

    }
}
