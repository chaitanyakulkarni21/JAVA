// Using this keyword to invoke default constructor

class Book1{
  int id;
  String title;

  Book1(){
    System.out.println("Default Constructor Invoked...");
  }
  Book1(int id, String title){
    this();
    this.id = id;
    this.title = title;
  }
  void display(){
    System.out.println("Book id: " + id);
    System.out.println("Title: " + title);
  }

  public static void main(String[] args){
    Book1 b1 = new Book1(2,"JAVA");
    b1.display();
  }
}