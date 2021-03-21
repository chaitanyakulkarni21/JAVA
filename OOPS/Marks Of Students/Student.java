import java.util.Scanner;

class Student{
  String name;
  int sub1, sub2, sub3, sub4, sub5;
  int avg;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    Student st = new Student();
    System.out.println("Enter Student name: ");
    st.name = sc.nextLine();
    System.out.println("Enter marks in 5 subjects : ");
    st.sub1 = sc.nextInt();
    st.sub2 = sc.nextInt();
    st.sub3 = sc.nextInt();
    st.sub3 = sc.nextInt();
    st.sub5 = sc.nextInt();

    st.avg = (st.sub1 + st.sub2 + st.sub3 + st.sub4 + st.sub5) / 5;

    System.out.println("\nStudent Name: " + st.name);
    System.out.println("Marks in Subject 1 : " + st.sub1);
    System.out.println("Marks in Subject 2 : " + st.sub2);
    System.out.println("Marks in Subject 3 : " + st.sub3);
    System.out.println("Marks in Subject 4 : " + st.sub4);
    System.out.println("Marks in Subject 5 : " + st.sub5);
    System.out.println("Average: " + st.avg);

    if(st.avg > 50){
      System.out.println("PASS");
    } else{
      System.out.println("FAIL");
    }
  }
}