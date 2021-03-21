import java.util.Scanner;

class GreatestOfTwoNumbers{
	public static void main(String[] args){
    	Scanner obj = new Scanner(System.in);
        int x, y;
        System.out.println("Enter two numbers: ");
        x = obj.nextInt();
        y = obj.nextInt();
        if (x > y){
        	System.out.println(x + " is greater than " + y);
        } else{
        	System.out.println(y + " is greater than " + x);
        }
    }
}