class Strings{
  public static void main(String[] args){
    String txt = "Hello World!!!";
    System.out.println("The given string is " + txt);
    System.out.println("The length of the string is " + txt.length());
    System.out.println("The given string in uppercase: " + txt.toUpperCase());
    System.out.println("The given string in lowercase: " + txt.toLowerCase());

    // Finding a string

    String newText = "Please locate where the string 'locate' occurs";
    System.out.println("The index of the string 'locate' is " + newText.indexOf("locate"));
  }
}