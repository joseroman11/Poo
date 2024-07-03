package Package1;

public class gradeBookTest {
    public static void main(String[] args) {
        gradeBook planilla= new gradeBook();

        planilla.setCourseName(" Materia");

        String message = planilla.displayMesage();
        System.out.println(message);
    }

}