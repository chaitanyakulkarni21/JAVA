import java.util.Scanner;

class Student{
    private int age;
    private String name;
    
    void getInfo(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    void printInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student st = new Student();
    
    System.out.println("Enter Student Name: ");
    String x = sc.nextLine();
    System.out.println("Enter Student Age: ");
    int y = sc.nextInt();
    
    st.getInfo(y,x);
    st.printInfo();
  }
}