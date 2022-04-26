package Collage_Q2;

public class Student {
    
    private int StudentId;
    private String StudentName;
    private   double ExamFee;

    public Student(){
        super();
    }

    public Student(int studentId, String studentName, double examFee) {
        super();
        StudentId = studentId;
        StudentName = studentName;
        ExamFee = examFee;
    }
    public int getStudentId() {
        return StudentId;
    }
    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public double getExamFee() {
        return ExamFee;
    }
    public void setExamFee(double examFee) {
        ExamFee = examFee;
    }

    public void displayDetails(){  // provide construct method

        System.out.println("Studen Id :"+StudentId);
        System.out.println("Studen name :"+StudentName);
        System.out.println("Studen fee :"+ExamFee);
    }
    public double payfee(){  //provide constuct method 
        return this.ExamFee;
    }
}
