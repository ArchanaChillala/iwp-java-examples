package com.archana.school;

import java.util.*;

import static java.util.Collections.emptyList;
import static java.util.Collections.sort;
import static java.util.Collections.unmodifiableMap;

public class School {
    private Map<Integer, List<String>> studentList;

    public School() {
        studentList = new HashMap<>();
    }

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
        if(studentList.containsKey(grade)) {
            studentList.get(grade).add(name);
        }
        else {
            List<String> namesList = new ArrayList<>();
            namesList.add(name);
            studentList.put(grade, namesList);
        }
    }

    public List<String> grade(int grade) {
        return studentList.getOrDefault(grade, emptyList());
    }

    public Map<Integer, List<String>> studentsByGradeAlphabetical() {
         for(int grade : studentList.keySet()) {
            sort(studentList.get(grade));
        }
        return unmodifiableMap(studentList);
    }
}
