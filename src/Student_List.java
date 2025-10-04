import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class Student_List  {
    Student[] StudentList;
    Student[] COPYList;
int capacity;
int size ;
Student_List(){
    this.capacity = 4;
    size = 0;
    StudentList = new Student[capacity];
}
Student_List(Student_List other){
    this.capacity = other.capacity;
    this.size = other.size;
    this.StudentList= other.StudentList;
}
public Student get(int i ){
    return StudentList[i];
}
public void add(Student e){
    for(int i  = 0 ; i < StudentList.length ; i++){
        if(StudentList[i]==null){
            StudentList[i] = e;
            size++;
            break;
        } else if (StudentList[StudentList.length-1] != null) {
       setCapacity(capacity*2);
        }
    }
}
public void add(int index , Student e){

    for(int i = capacity-1 ; i >=index ;i--){
        StudentList[i] = StudentList[i-1];
    }
    StudentList[index] = e;
    size++;
}
public void Replace(Student e , int i ){
    if(get(i) != null){
        StudentList[i] = e;
    }
    else {
        System.out.println("NOT FOUND AT INDEX :" + i + " \uD83D\uDE22");
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
    if (!searchByIndex(i).equals(null)) {
        for (int j = i; j < StudentList.length - 1; j++) {
           StudentList [i] = null;
            Student temp = get(j);
            StudentList[j] = StudentList[j + 1];
            StudentList[j + 1] = temp;
        }
    }else {
        System.out.println("already null \uD83D\uDE0D");
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
public Student searchByIndex(int index) {
    Student current = StudentList[index];
    if (!current.equals(null)){
        return current;
}else{
        return null;
    }
}
public void remove(Student s1){
    int Student_index  = searchById(s1.rollnum);
    if(Student_index != -1) {
        remove(Student_index);
        System.out.println("Yaaaahooooo done \uD83D\uDE0D");
    }
    else{
        System.out.println("Not Found \uD83D\uDE2D");
    }
    }
 public void setCapacity(int capacity) {
        this.capacity = capacity;
        COPYList = new Student[capacity];
        for(int  i = 0 ; i<size ; i++) {
            COPYList[i] = StudentList[i];
        }
     this.StudentList = COPYList;
}
//String concatenation method in which java create new String in every single concatenation
    //public String toString() {
//    String output = "";
//    for(int i = 0 ; i< StudentList.length; i++){
//        output += StudentList[i];
//        output+= "\n";
//    }
//        return output;
//    }
    //Stringbuilder
    //by using String buildwer
public String toString(){
    StringBuilder StudentsData = new StringBuilder();
    for(int i = 0; i < capacity ; i++){
        StudentsData.append(StudentList[i]);
    }
    return StudentsData.toString();
    }
}
