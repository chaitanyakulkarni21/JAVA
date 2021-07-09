import java.util.Scanner;

class Area{
  private int side;
  void getData(int sqSide){
    this.side = sqSide;
  }
  void calArea(){
    System.out.println("Area of Square is: "+this.side*this.side);
  }
}
class Square{
  public static void main(String args[]){
    Square sq = new Square();
    System.out.println("Enter Square side: ");
    Scanner sc = new Scanner(System.in);
    sq.side = nextInt();  
    sq.getData(sq.side);
    System.out.println("Area of Square is: "+sq.calArea());
  }
}