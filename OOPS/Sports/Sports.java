class Sports {
  String sportName;
  String sportType;
  public void printData(String name, String type){
    System.out.println("Sport Name = " + name);
    System.out.println("Sport Type = " + type);
  }
  public static void main (String[] args){
    Sports sprt = new Sports();
    sprt.sportName = "Cricket";
    sprt.sportType = "Outdoor";
    sprt.printData(sprt.sportName, sprt.sportType);

    System.out.println("\n");
    
    Sports sprt2 = new Sports();
    sprt2.sportName = "Badminton";
    sprt2.sportType = "Indoor";
    sprt2.printData(sprt2.sportName, sprt2.sportType);

  }
}