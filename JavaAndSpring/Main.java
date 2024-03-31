package src.JavaAndSpring;

import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        EmployeeComparable[] emarr = new EmployeeComparable[2];
        emarr[0] = new EmployeeComparable(123, "moin");
        emarr[1] = new EmployeeComparable(34, "zalik");


        Arrays.sort(emarr);

        System.out.println(Arrays.toString(emarr));


        // sort byu name...

//        EmployeeComparator employeeComparator = new EmployeeComparator();
        Arrays.sort(emarr, new EmployeeComparator());

        System.out.println(Arrays.toString(emarr));



    }
}
