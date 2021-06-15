package comparision;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.*;

public class UnitTest {
    ArrayList<Student> arr = new ArrayList<Student>();

    @Test
    public void comparisionTest(){
        initArr();
        System.out.println("Original Arr: ");
        for ( Student s : arr)
            System.out.println(s.toString());

        Comparators com = new Comparators();

        arr.sort(com.ac);

        System.out.println("Arr sorted by Age: ");
        for ( Student s : arr)
            System.out.println(s.toString());

        Collections.sort(arr);

        System.out.println("Arr sorted by Name: ");
        for ( Student s : arr)
            System.out.println(s.toString());

        arr.sort(com.rc);
        System.out.println("Arr sorted by roll number: ");
        for ( Student s : arr)
            System.out.println(s.toString());
        
    }

    public void initArr() {
        Student s1 = new Student ( 1, "JRM", 48);
        Student s2 = new Student ( 2, "SHH", 45);
        Student s3 = new Student ( 4, "JXX", 6);
        Student s4 = new Student ( 3, "JYX", 11);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
    }
}
