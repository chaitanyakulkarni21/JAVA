import java.util.Scanner;

class Book{
    String bookName;
    int pages;
    String authorName;
    
    void getBookInfo(String name, int pgs, String author){
        this.bookName = name;
        this.pages = pgs;
        this.authorName = author;
    }
    
    void printBookInfo(){
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Number of Pages: " + this.pages);
        System.out.println("Author: " + this.authorName);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.println("Enter book details: ");
        System.out.println("Book Name: ");
        b.bookName = sc.nextLine();
        System.out.println("Author: ");
        b.authorName = sc.nextLine();
        System.out.println("Number of Pages: ");
        b.pages = sc.nextInt();
        
        b.getBookInfo(b.bookName, b.pages, b.authorName);
        System.out.println();
        b.printBookInfo();    
    }   
}