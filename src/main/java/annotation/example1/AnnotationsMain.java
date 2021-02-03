package annotation.example1;

public class AnnotationsMain {
    public static void main(String[] args) {
        //.class duomenys/info apie pacia klase
        Class<Student> classObject = Student.class;

        if (classObject.isAnnotationPresent(StudentInfo.class)) {
            System.out.println("Student info annotation yra");
            StudentInfo studentInfo = classObject.getAnnotation(StudentInfo.class);
            System.out.println("StudentInfo from specific annotation");
            System.out.println(studentInfo.studentName());
            System.out.println(studentInfo.studentAdress());
        }

    }
}
