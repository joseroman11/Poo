package taller3;

public class GradeBook {

    private String courseName;

    public GradeBook() {
    }
    public static long promEstudiante(long a, long b, long c, long d, long e){
        long prom = (a+b+c+d+e)/5;

        return prom;
    };


    public GradeBook(String cs102DataStructuresInJava) {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String displayMessage()
    {
        return  "Welcome to the grade book " + getCourseName();

    }
}