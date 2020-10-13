package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2
{
    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6453);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 84531);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting:");
        System.out.println(list);
        Collections.sort(list, new SalaryComporator());
        System.out.println("After sorting:");
        System.out.println(list);

    }

}

class Employee
        implements Comparable<Employee>
{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o)
    {
        if (this.id == o.id){
            return 0;
        } else if (this.id < o.id){
            return -1;
        } else {
            return 1;
        }
//        // second case:
//       // return this.id - o.id;
//
//        // but only with Integer amd String
//      //  return this.id.compareTo(o.id);
//
//        // using def method String
////        int res =  this.name.compareTo(o.name);
////        if (res == 0){
////            res =  this.surname.compareTo(o.surname);
////        }
////        return res;
    }
}

class IdComporator implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id){
            return 0;
        } else if (emp1.id < emp2.id){
            return -1;
        } else {
            return 1;
        }
    }
}

class MameComporator implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComporator implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}