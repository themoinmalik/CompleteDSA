package src.collection.com;

public class Employee implements Comparable<Employee> {


    int Id;
    String name;
    int age;


    public Employee(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.Id - o.Id;
    }
}



