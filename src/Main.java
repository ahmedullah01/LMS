import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Courses c1 = new Courses();
        c1.Sem1();
        Student phela = new Student("ahmed", "B24110006081", c1);
        Student third = new Student("sohail", "B24110006041", c1);
        Student fourth = new Student("rafay", "B24110006090", c1);
        Student dosra = new Student("ali ahmed", "B24110006061", c1);
Student_List semester_1 = new Student_List();
semester_1.AddStudent(phela);
semester_1.AddStudent(third);
semester_1.AddStudent(fourth);
        semester_1.AddStudent(dosra);
        Collections.sort(semester_1.StudentList);
        semester_1.RemoveStudent(phela);
        for(Student value : semester_1){
            System.out.println(value);
        }
        }
    }
