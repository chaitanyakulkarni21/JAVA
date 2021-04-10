//Use of this keyword to invoke parameterized constructor

class Book2{
  int id;
  String title;
  int pages;

  Book2(int id, String title){
    this.id = id;
    this.title = title;
  }

  Book2(int i, String t, int p){
    this(i,t);  // invokes parameterized constructor
    pages=p;
  }

  void display(){
    System.out.println("Book id: " + id);
    System.out.println("Title: " + title);
    System.out.println("No. of pages: " + pages);
  }

  public static void main(String[] args){
    Book2 b2 = new Book2(1, "Java", 360);
    b2.display();
  } 
}