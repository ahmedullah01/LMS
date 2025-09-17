import java.util.Arrays;

public class Student implements Comparable<Student>{
    public String name;
   public String rollnum;
Courses courses;

Student(){
    courses = new Courses();
}
    public Student(String name, String rollnum , Courses courses  ) {
this.courses = new Courses(courses);
        this.name = name;
        this.rollnum = rollnum;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollnum() {
        return rollnum;
    }

    public void setRollnum(String rollnum) {
        this.rollnum = rollnum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollnum='" + rollnum + '\'' +
courses +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }


}
