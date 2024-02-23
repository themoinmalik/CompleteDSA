package src.collection.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    int Id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.Id = id;
        this.name = name;
        this.age = age;
    }

    // sort based on age...
//    @Override
//    public int compareTo(Student o) {
//        System.out.println("Hello world");
//        if (this.age == o.age)
//            return 0;
//        else if (this.age > o.age)
//            return 1;
//        else
//            return -1;
//    }

    // sort based on Id...

    @Override
    public int compareTo(Student s){
        return this.Id - s.Id;

    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class MainClass {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"moin",20));
        list.add(new Student(9,"malik", 29));
        list.add(new Student(3, "khan", 20));

        Collections.sort(list);
        System.out.println(list);

    }

}
