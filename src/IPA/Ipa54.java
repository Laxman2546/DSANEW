package IPA;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Course{
    int courseId;
    String courseName;
    double courseRating;
    String mode;
    boolean haveCertificate;
    public Course(int courseId,String courseName,double courseRating,String mode,boolean haveCertificate){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseRating = courseRating;
        this.mode= mode;
        this.haveCertificate = haveCertificate;
    }
    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public double getCourseRating(){
        return courseRating;
    }
    public String getMode(){
        return mode;
    }
    public boolean getHaveCertificate(){
        return haveCertificate;
    }
}
class Ipa54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courseArr = new Course[4];
        for(int i=0;i<courseArr.length;i++){
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            double courseRating = sc.nextDouble();
            sc.nextLine();
            String mode = sc.nextLine();
            boolean haveCertificate = sc.nextBoolean();
            sc.nextLine();
            courseArr[i] = new Course(courseId,courseName,courseRating,mode,haveCertificate);
        }
        int num  = sc.nextInt();
        sc.nextLine();
        String funMode = sc.nextLine();
        int count = countCourse(courseArr,num,funMode);
        System.out.println(count > 0 ? count:"No course found");
        sc.close();
    }
    public static int countCourse(Course[] courseArr,int num,String funMode){
        int total = 0;
        for(Course course : courseArr){
            if(course.getHaveCertificate() && funMode.equalsIgnoreCase(course.getMode())&& course.getCourseRating() >= num){
                total++;
            }
        }
        return total;
    }

}

