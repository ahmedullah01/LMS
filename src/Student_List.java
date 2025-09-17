import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student_List implements Iterable<Student> {
Student s1 = new Student();
int  index = 0;

    public Iterator<Student> iterator() {
        return  new Iterator<Student>() {

            int index = 0;
            public boolean hasNext() {
                return index<StudentList.size();
            }

            @Override
            public Student next() {
                Student data  = StudentList.get(index++);
                return  new Student(data.getName(), data.getRollnum(), data.courses);
            }
        };
    }

    ArrayList<Student> StudentList = new ArrayList<>();


public void AddStudent(Student e){
        this.StudentList.add(e);
    System.out.println("Added Successfullyyyy!");
}

public void Search(){
    System.out.println("wanna search by 1)name or 2)rollnum");
    Scanner sc = new Scanner(System.in);
    int num  = sc.nextInt();
    sc.nextLine();
    if(num == 1){
        System.out.println("enter the name");
        String name = sc.nextLine();
        searchbyName(name);
    } else if (num == 2) {
        System.out.println("enter the rollnum");
        String rollnumber = sc.nextLine();
        searchById(rollnumber);
    }
}

public int searchbyName(String name) {
    for (int i = 0; i < StudentList.size(); i++) {
    Student s = StudentList.get(i);
        if (name.equals(s.getName())) {
              return i;
        }
    }
    return -1;
}
public int searchById(String rollnum){
    for(int i  = 0; i < StudentList.size();i++ ){
        Student s = StudentList.get(i);

            if(rollnum.substring(1).equals(s.getRollnum().substring(1) )){
return  i;
            }
    }
    return -1;
}


    public void setS1(Student s1 , int index) {
        this.StudentList.set(index ,s1);
        System.out.println("Added Successfully");
    }
    public void RemoveStudent(Student s1){
    boolean flag  = false;
 for (int  i = 0 ; i < StudentList.size() ; i++){
     Student s = StudentList.get(i);
     if(s1.getName().equals(s.getName())){
         if(s1.rollnum.substring(1).equals(s.getRollnum().substring(1) )){
             StudentList.remove(i);
             flag = true;
             System.out.println("remove at index " + i);

         }
     }
     if(flag == false){
         System.out.println("not found");
     }

 }
    }
}
