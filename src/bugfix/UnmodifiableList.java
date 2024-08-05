package bugfix;

import java.util.Arrays;
import java.util.List;

public class UnmodifiableList {
    private static List<String> studentList;
    public static void main(String[] args) {
        String [] students = new String[] {"Saro", "Akal", "Sandhiya", "Pravin", "Paangi"};
        addStudents(students);
        students = new String[] {"Rohit", "Renu"};
        addStudents(students);
    }
    private static void addStudents(String [] students) {
        if (studentList == null) {
            studentList = Arrays.asList(students);
        }
        else {
            studentList.addAll(Arrays.asList(students));
        }
    }
}
