import java.util.HashSet;

public class CustomHashSet {
    public static void main(String[] args) {

        HashSet<Student> studentSet = new HashSet<Student>();
        
        studentSet.add(new Student("Omkar", 9));
        studentSet.add(new Student("Santoshi", 20));
        studentSet.add(new Student("Prathamesh", 15));

        studentSet.add(new Student("Prajakta", 20));

        System.out.println(studentSet);

    }
}
