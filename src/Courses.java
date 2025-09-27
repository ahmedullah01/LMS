    import java.io.Serializable;
    import java.util.Arrays;

    public class Courses implements Serializable {
        String[] courseName = new String[6];
        int[] courseNum = new int[6];



        public void Sem1(){
            this.courseName = new String[]{"ICS-1","Calculus-1","Statistics and Data Analysis","Physics - I","English","Islamic Learning or Ethics","\tPakistan Studies"};
        this.courseNum = new int[]{301,303,305,307,309,311,313};

        }



    Courses(){}

    Courses(Courses courses){
            for(int  i = 0 ; i < courseName.length ; i++){
                this.courseName[i]= courses.courseName[i];
            }

        for(int  i = 0 ; i < courseNum.length ; i++){
            this.courseNum[i]= courses.courseNum[i];
        }

    }

        @Override
        public String toString() {
            return "Courses{" +
                    "courseName=" + Arrays.toString(courseName) +
                    ", courseNum=" + Arrays.toString(courseNum) +
                    '}';
        }
    }
