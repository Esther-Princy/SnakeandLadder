package player;

public class Player {
   String name;
   String contactNo;
   String emailID;
   String address;
   int age;
   public void setPlayerDetails(String name,String address,String contactNo,String emailID,int age){
      this.name=name;
      this.contactNo=contactNo;
      this.emailID=emailID;
      this.address=address;
      this.age=age;
   }
   public void setPlayerName(String name){
    this.name=name;
   }
   public void getPlayerDetails(){
    System.out.println("Player name: " + this.name);
    System.out.println("Player age: " + this.age);
    System.out.println("Player Contact number: " + this.contactNo);
    System.out.println("Player emailID: " + this.emailID);
    System.out.println("Player address: " + this.address);
    }
    public String getPlayerName(){
       return this.name;
    }
}
