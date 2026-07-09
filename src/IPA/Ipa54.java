package IPA;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Course2 {
    int courseId;
    String courseName;
    double courseRating;
    String mode;
    boolean haveCertificate;
    public Course2(int courseId, String courseName, double courseRating, String mode, boolean haveCertificate){
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
public class Ipa54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course2[] courseArr = new Course2[4];
        for(int i=0;i<courseArr.length;i++){
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            double courseRating = sc.nextDouble();
            sc.nextLine();
            String mode = sc.nextLine();
            boolean haveCertificate = sc.nextBoolean();
            sc.nextLine();
            courseArr[i] = new Course2(courseId,courseName,courseRating,mode,haveCertificate);
        }
        int num  = sc.nextInt();
        sc.nextLine();
        String funMode = sc.nextLine();
        int count = countCourse(courseArr,num,funMode);
        System.out.println(count > 0 ? count:"No course found");
        sc.close();
    }
    public static int countCourse(Course2[] courseArr, int num, String funMode){
        int total = 0;
        for(Course2 course : courseArr){
            if(course.getHaveCertificate() && funMode.equalsIgnoreCase(course.getMode())&& course.getCourseRating() >= num){
                total++;
            }
        }
        return total;
    }

}

