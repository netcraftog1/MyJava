package comparision;

import java.util.Comparator;

public class Comparators {
    AgeComparator ac = new AgeComparator();
    NameComparator nc = new NameComparator();
    RollNoCompator rc = new RollNoCompator();
}

class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class RollNoCompator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }

}