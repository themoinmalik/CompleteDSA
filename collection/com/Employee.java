package src.collection.com;

public class Employee {


    int Id;
    String name;
    int age;


    public Employee(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

 /*   @Override
    public int compareTo(Employee o) {
        return this.Id - o.Id;
    }*/

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



