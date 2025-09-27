import java.io.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Courses c1 = new Courses();
        c1.Sem1();
        Student cs1 = new Student("ahmed", "B24110006081", c1);
        Student cs2 = new Student("sohail", "B24110006041", c1);
        Student cs3 = new Student("rafay", "B24110006090", c1);
        Student cs4 = new Student("ali ahmed", "B24110006061", c1);
Student_List semester_1 = new Student_List();
semester_1.add(cs1);
semester_1.set(cs2 , 0);
semester_1.remove(0);
//semester_1.AddStudent(cs2);
//semester_1.AddStudent(cs3);
//semester_1.AddStudent(cs4);
        System.out.println(semester_1);





//serialization
//        ByteArrayOutputStream fos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(semester_1);


        //deserialization
//    /    ByteArrayInputStream bis = new ByteArrayInputStream(fos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bis);
//Student_List r =(Student_List) ois.readObject();
//        r.RemoveStudent(cs1);
//    System.out.println(semester_1.StudentList);
//        System.out.println("***************************************");
//        System.out.println(r.StudentList);


        //for(Student value : semester_1){
//System.out.println(value);
//        }
        }
    }
