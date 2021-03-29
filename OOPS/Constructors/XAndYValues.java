// Program to set new values of variables that are initialized using Constructor

import java.util.Scanner;

class XAndYValues{
    private int x;
    private int y;
    
    public XAndYValues(int x, int y){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
    void changeXAndY(int newx, int newy){
        this.x = newx;
        this.y = newy;
    }
    
    void printXAndY(){
        System.out.println("New x = " + x);
        System.out.println("New y = " + y);
    }
    public static void main(String[] args){
        System.out.println("x and y are initialized as : ");
        XAndYValues m = new XAndYValues(5,10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new values of x and y: ");
        m.x = sc.nextInt();
        m.y = sc.nextInt();
        m.changeXAndY(m.x,m.y);
        System.out.println("New x and y are : ");
        m.printXAndY();
    }
}