// Import marks and display result Pass or Fail

import java.util.Scanner;

class Result {
    public static void main(String[] args){
        int obtainedMarks, passingMarks;
        passingMarks = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained: ");
        obtainedMarks = sc.nextInt();

        if(obtainedMarks > passingMarks){
            System.out.println("PASSED");
        } else{
            System.out.println("FAILED");
        }
    }
}