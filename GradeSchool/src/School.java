import java.util.*;

import static java.util.Collections.emptyList;
import static java.util.Collections.sort;
import static java.util.Collections.unmodifiableMap;

public class School {
    private HashMap<Integer, List<String>> studentList = new HashMap<>();

    public Map<Integer, List<String>> getStudentList() {
        return unmodifiableMap(studentList);
    }

    public int numberOfStudents() {
        int totalStudents = 0;
        for(int grade : studentList.keySet())
             totalStudents += studentList.get(grade).size();
        return totalStudents;
    }

    public void add(String name, int grade) {
        if(studentList.keySet().contains(grade)) {
            studentList.get(grade).add(name);
        }
        else {
            List<String> namesList = new ArrayList<>();
            namesList.add(name);
            studentList.put(grade, namesList);
        }
    }

    public List<String> grade(int grade) {
        if(studentList.keySet().contains(grade))
            return studentList.get(grade);
        else
            return emptyList();
    }

    public Map<Integer, List<String>> studentsByGradeAlphabetical() {
        HashMap<Integer, List<String>> sortedStudentList = studentList;
         for(int grade : sortedStudentList.keySet()) {
            sort(sortedStudentList.get(grade));
        }
        return unmodifiableMap(sortedStudentList);
    }
}
