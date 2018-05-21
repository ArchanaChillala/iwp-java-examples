import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class SchoolTest {
    private School school;

    @Before
    public void setUp() {
        school = new School();
    }

    @Test
    public void startsWithNoStudents() {
        assertThat(school.numberOfStudents(), is(0));
    }

    @Test
    public void addsStudents() {
        school.add("Aimee", 2);
        assertThat(school.grade(2), hasItem("Aimee"));
    }

    @Test
    public void addsMoreStudentsInSameGrade() {
        final int grade = 2;
        school.add("James", grade);
        school.add("Blair", grade);
        school.add("Paul", grade);

        assertThat(school.grade(grade).size(), is(3));
        assertThat(school.grade(grade), allOf(hasItem("James"), hasItem("Blair"), hasItem("Paul")));
    }

    @Test
    public void addsStudentsInMultipleGrades() {
        school.add("Chelsea", 3);
        school.add("Logan", 7);

        assertThat(school.numberOfStudents(), is(2));
        assertThat(school.grade(3).size(), is(1));
        assertThat(school.grade(3), hasItem("Chelsea"));
        assertThat(school.grade(7).size(), is(1));
        assertThat(school.grade(7), hasItem("Logan"));
    }

    @Test
    public void getsStudentsInEmptyGrade() {
        assertTrue(school.grade(1).isEmpty());
    }

    @Test
    public void modifyingFetchedGradeShouldNotModifyInternalDatabase() {
        String shouldNotBeAdded = "Should not be added to school";
        int grade = 1;

        Collection students = school.grade(grade);

        try {
            students.add(shouldNotBeAdded);
        } catch (Exception exception) {
            // Also valid that the add operation throws an exception
            // Such as UnsupportedOperationException when an umodifiable collection type is used
        }

        assertThat(school.grade(grade), not(hasItem(shouldNotBeAdded)));
    }

    @Test
    public void modifyingSortedStudentsShouldNotModifyInternalDatabase() {
        int grade = 2;
        String studentWhichShouldNotBeAdded = "Should not be added";
        List<String> listWhichShouldNotBeAdded = new ArrayList<>();
        listWhichShouldNotBeAdded.add(studentWhichShouldNotBeAdded);

        Map sortedStudents = school.studentsByGradeAlphabetical();

        try {
            sortedStudents.put(grade, listWhichShouldNotBeAdded);
        } catch (Exception exception) {
            // Also valid that the put operation throws an exception
            // Such as UnsupportedOperationException when an unmodifiableMap is used
        }

        assertThat(school.studentsByGradeAlphabetical().get(grade),
                not(hasItem(studentWhichShouldNotBeAdded)));
    }
}