import java.util.ArrayList;
import java.util.List;

public class Aufgabe5
{
    public static void main(String[] args)
    {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Pascal", 1810647289, 2017));
        studentList.add(new Student("Kevin", 124928789, 2015));
        studentList.add(new Student("Kenneth", 839274810, 2012));

        for (Student s: studentList){
            System.out.println(s);
        }
    }

}

