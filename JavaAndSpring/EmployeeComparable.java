package src.JavaAndSpring;


public class EmployeeComparable implements Comparable<EmployeeComparable>{

    private int rollno;

    private String name;

    public EmployeeComparable(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public int compareTo(EmployeeComparable o){
        return this.rollno - o.rollno;

    }

    @Override
    public String toString(){
        return "rollno " + this.rollno + "name " + this.name;
    }

}
