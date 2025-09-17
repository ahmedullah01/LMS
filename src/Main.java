import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Courses c1 = new Courses();
        c1.Sem1();
        Student cs1 = new Student("ahmed", "B24110006081", c1);
        Student cs2 = new Student("sohail", "B24110006041", c1);
        Student cs3 = new Student("rafay", "B24110006090", c1);
        Student cs4 = new Student("ali ahmed", "B24110006061", c1);
Student_List semester_1 = new Student_List();
semester_1.AddStudent(cs1);
semester_1.AddStudent(cs2);
semester_1.AddStudent(cs3);
        semester_1.AddStudent(cs4);
        Collections.sort(semester_1.StudentList);
        semester_1.RemoveStudent(cs1);
        for(Student value : semester_1){
            System.out.println(value);
        }
        }
    }
