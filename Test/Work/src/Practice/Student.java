package Practice;


public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int age;
   

    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String s  = "" + this.rollNo + "/" + this.name +"/" + this.age;
        return s;
    }

    @Override
    public int compareTo(Student o) {
       return this.name.compareTo(o.name);
    }

public static void main(String[] args) {
    System.out.println("Hello World");
}

}


