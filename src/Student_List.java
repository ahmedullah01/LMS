import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Student_List  {
    Student[] StudentList;
int capacity;

Student_List(){
    this.capacity = 100;
    StudentList = new Student[capacity];
}

public Student get(int i ){
    return StudentList[i];
}

public void add(Student e){
    for(int i  = 0 ; i < StudentList.length ; i++){
        if(StudentList[i]==null){
            StudentList[i] = e;
            break;
        } else if (StudentList[StudentList.length-1] != null) {
            try{
                throw new IndexOutOfBoundsException();
            }catch (IndexOutOfBoundsException eee){
                System.out.println("size fullllllllllllllllllll");
            }
        }
    }
}

public void set(Student e , int i ){
    if(get(i) != null){
        StudentList[i] = e;
    }
    else{
        try{
            throw new IndexOutOfBoundsException();
        }catch (IndexOutOfBoundsException ey){
            System.out.println( "first add value then set");
        }
    }
}



//    public Iterator<Student> iterator() {
//        return  new Iterator<Student>() {
//
//            int index = 0;
//            public boolean hasNext() {
//                return index<StudentList.size();
//            }
//
//            @Override
//            public Student next() {
//                Student data  = StudentList.get(index++);
//                return  new Student(data.getName(), data.getRollnum(), data.courses);
//            }
//        };
//    }

   // ArrayList<Student> StudentList = new ArrayList<>();


public void AddStudent(Student e){
        add(e);
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

public void remove(int i ) {
    if (get(i) != null) {
        for (int j = i; j < StudentList.length - 1; j++) {
           StudentList [i] = null;
            Student temp = get(j);
            StudentList[j] = StudentList[j + 1];
            StudentList[j + 1] = temp;
        }
    }else {
        System.out.println("already null");
    }
}


public int searchbyName(String name) {
    for (int i = 0; i < StudentList.length; i++) {
    Student s = get(i);
        if (name.equals(s.getName())) {
              return i;
        }
    }
    return -1;
}
public int searchById(String rollnum){
    for(int i  = 0; i < StudentList.length;i++ ){
        Student s =
                get(i);

            if(rollnum.substring(1).equals(s.getRollnum().substring(1) )){
return  i;
            }
    }
    return -1;
}

    public void RemoveStudent(Student s1){
    boolean flag  = false;
 for (int  i = 0 ; i < StudentList.length ; i++){
     Student s = get(i);
     if(s1.getName().equals(s.getName())){
         if(s1.rollnum.substring(1).equals(s.getRollnum().substring(1) )){
             remove(i);
             flag = true;
             System.out.println("remove at index " + i);

         }
     }
     if(flag == false){
         System.out.println("not found");
     }

 }
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        StudentList = new Student[capacity];
    }

    @Override
    public String toString() {
        return "Student_List{" +
                "StudentList=" + Arrays.toString(StudentList) +
                '}';
    }
}
