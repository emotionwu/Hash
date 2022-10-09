import java.util.HashSet;
import java.util.HashMap;
public class HashCode {
    public static void main(String[] args){

        int a=42;
        System.out.println(((Integer)a).hashCode());

        int b=-42;
        System.out.println(((Integer)b).hashCode());

        double c=3.1415926;
        System.out.println(((Double)c).hashCode());

        String d = "love";
        System.out.println(d.hashCode());

        Student student= new Student(3,2,"bobo","liu");
        System.out.println(student.hashCode());

        HashSet<Student> set=new HashSet<>();
        set.add(student);
        System.out.println(set);

        HashMap<Student, Integer> scores=new HashMap<>();
        scores.put(student,100);
        System.out.println(scores);

        Student student1=new Student(3,2,"bobo","liu");
        System.out.println(student1.hashCode());
    }
}
