import dice.Dice;
import player.Player;
import coordinates.Coordinates;
import jumper.Jumper;
import board.Board;
import game.Game;
import java.util.HashMap;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String,Jumper> map=new HashMap<>();
        map.put("6",new Jumper(new Coordinates(9,5),new Coordinates(6,6)));
        map.put("97",new Jumper(new Coordinates(0,1),new Coordinates(9,9)));
        map.put("21",new Jumper(new Coordinates(7,0),new Coordinates(0,9)));
        map.put("64",new Jumper(new Coordinates(3,3),new Coordinates(7,4)));

      //  Dice dice=new Dice();
     //System.out.println(dice.diceRoll());
      //Coordinates c=new Coordinates(3,7);
      //Coordinates d=new Coordinates(6,7);
      //System.out.println(c.printCoordinates());
      //Jumper j=new Jumper(c,d);
     // System.out.println(j.getJumperName());
     
      Player p1=setPlayerDetailsFromUserInput();;
      Player p2=setPlayerDetailsFromUserInput();
       p1.getPlayerDetails();
      System.out.println("The PlayerName is: " + p1.getPlayerName());
       System.out.println("The PlayerName is: " + p2.getPlayerName());
       Board b= new Board(10,map);
      b.printBoard();
      Game game=new Game(b,new Player[]{p1,p2},new Dice());
      game.play();

    }
    public static  Player setPlayerDetailsFromUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Player Details: ");
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your contact number: ");
        String contactNo=sc.nextLine();
        System.out.println("Enter your address: ");
        String address=sc.nextLine();
        System.out.println("Enter your emailID: ");
        String emailID=sc.nextLine();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        Player p=new Player();
        p.setPlayerDetails(name,address,contactNo,emailID,age);
        return p;
    }
}
