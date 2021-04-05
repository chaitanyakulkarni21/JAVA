class Book{
  int id;
  String title;

  Book(int id, String title){
    this.id = id;
    this.title = title;
  }
  void display(){
    System.out.println("Book ID: " +id);
    System.out.println("Title: "+ title);
  }
  public static void main(String[] args){
    Book b1 = new Book(1, "JAVA");
    Book b2 = new Book(2, "C - Programming");
    b1.display();
    b2.display();
  }
}