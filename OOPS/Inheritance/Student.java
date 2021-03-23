// Program to print Student information using Inheritance

import java.util.Scanner;

class Person {
  protected String personName;
  protected int personAge;
  protected String personInstName;

  void setInfo(String name, int age, String instName){
    this.personAge = age;
    this.personName = name;
    this.personInstName = instName;
  }
}

public class Student extends Person{
  private int passingYear;

  void setPassingYear(int year){
    this.passingYear = year;
  }

  void getInfo(){
    System.out.println("\nName: " + personName);
    System.out.println("Age: " + personAge);
    System.out.println("Institution Name: " + personInstName);
    System.out.println("Year of Passing: " + passingYear);
  }

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Student st = new Student();

    System.out.println("Enter Student name: ");
    st.personName = sc.nextLine();
    System.out.println("Enter Institution Name: ");
    st.personInstName = sc.nextLine();
    System.out.println("Enter Student Age: ");
    st.personAge = sc.nextInt();
    System.out.println("Enter Year of Passing: ");
    st.passingYear = sc.nextInt();
    

    st.setInfo(st.personName, st.personAge, st.personInstName);
    st.setPassingYear(st.passingYear);
    st.getInfo();
  }
}