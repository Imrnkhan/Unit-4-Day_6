package Collage_Q2;
public class Student {
    
    private int StudentId;
    private  String name;
    private int departmentId;
    private String gender;
    private String phone;
    

    public Student(){   //public class

    }


//creating constructor

    public Student(int studentId, String name, int departmentId, String gender, String phone) {
        StudentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phone = phone;
    }


    // creating getter and setter method
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
