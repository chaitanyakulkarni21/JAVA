class Student{
  private String studentName;
  private int studentAge;


  public void getData(){
    System.out.println("Student Name: " + studentName);
    System.out.println("Student Age: " + studentAge);
  }

  public void setData(String name, int age){
    this.studentAge = age;
    this.studentName = name;
  }
  // public String setStudentName(){
  //   return studentName;
  // }
  // public int setStudentAge(){
  //   return studentAge;
  // }
  // public void getStudentName(String name){
  //   this.studentName = name;
  // }
  // public void getStudentAge(int age){
  //   this.studentAge = age;
  // }
}

public class Encapsulation{
  public static void main(String[] args){
    Student st = new Student();

    st.setData("John Doe", 25);
    st.getData();
    // st.getStudentName("John Doe");
    // st.getStudentAge(25);
    // System.out.println("Student Name: " + st.setStudentName() + "\nStudent Age: " + st.setStudentAge());

  }
}