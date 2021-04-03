// Input integer, string and double type of data and print using Console class 

import java.util.Scanner;

class DataTypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Roll number : ");
        int rollno = sc.nextInt();

        System.out.println("Enter Fee : ");
        double fee = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);        
        System.out.println("Fee: " + fee);
    }
}