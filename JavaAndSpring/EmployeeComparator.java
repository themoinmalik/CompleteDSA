package src.JavaAndSpring;


import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeComparable> {


    public int compare(EmployeeComparable o1, EmployeeComparable o2){
        return o1.getName().compareTo(o2.getName());
    }

}
