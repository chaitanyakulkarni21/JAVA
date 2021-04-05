// Consstructor overloading using Object as Argument

class Student{
  int id;
  String name;

  Student(int x, String n){
    id = x;
    name = n;
  }
  Student(Student s){
    id = s.id;
    name = s.name;
  }
  void display(){
    System.out.println(id + " " + name);
  }

  public static void main(String[] args){
    Student s1 = new Student(002, "Manoj");
    Student s2 = new Student(s1);
    s1.display();
    s2.display();
  }
}