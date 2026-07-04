package IPA;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ipa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courseArr = new Course[4];
        for(int i=0;i<courseArr.length;i++){
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handson = sc.nextInt();
            sc.nextLine();
            courseArr[i] = new Course(courseId,courseName,courseAdmin,quiz,handson);
        }
        String name = sc.nextLine();
        int num = sc.nextInt();
        sc.nextLine();
        int avg = findAvg(courseArr,name);
        Course[] ans = sortCourse(courseArr,num);
        System.out.println(avg == 0 ?"No Course found" :avg);
        if(ans != null){
            for(Course a : ans){
                System.out.println(a.getCourseName());
            }
        }else{
            System.out.println("No Course found with mentioned attribute");
        }
    }
    public static int findAvg(Course[] courseArr,String name){
        int count = 0;
        int sum = 0;
        for(Course course : courseArr){
            if(name.equalsIgnoreCase(course.getCourseAdmin())){
                count++;
                sum+=course.getQuiz();
            }
        }
        return count == 0  ? 0 : sum / count;

    }
    public static Course[] sortCourse(Course[] courseArr,int num){
        List<Course> res = new ArrayList<>();
        for(Course course : courseArr){
            if(course.getHandson() < num){
                res.add(course);
            }
        }
        res.sort((a,b)->Integer.compare(a.getHandson(),b.getHandson()));
        int n = res.size();
        if(res.isEmpty()){
            return null;
        }
        Course[] ans = new Course[n];
        for(int i=0;i<n;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}


class Course{
    int courseId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;
    public Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;

    }
    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseAdmin(){
        return courseAdmin;
    }
    public int getQuiz(){
        return quiz;
    }
    public int getHandson(){
        return handson;
    }
}