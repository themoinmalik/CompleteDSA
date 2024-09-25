package src.JavaAndSpring;


import src.heap.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmployeeComparator implements Comparator<EmployeeComparable> {


    public int compare(EmployeeComparable o1, EmployeeComparable o2){
        PriorityQueue<Pair<Integer, Integer>> min = new PriorityQueue<>();
        return o1.getName().compareTo(o2.getName());
    }

}



