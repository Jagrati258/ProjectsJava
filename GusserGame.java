import java.util.*;
class Gusser {
    int Gussernum;

    public int takeNumberGusser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusser guess the number");
        Gussernum = sc.nextInt();
        return Gussernum;
    }
}
    class Player
    {
        int Playernum;
        public int takeNumberPlayer() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Player guess the number");
            Playernum = sc.nextInt();
            return Playernum;
        }
    }
      class Umpire
      {
          int numFromGusser;
          int numFromPlayer1;
          int numFromPlayer2;
          int numFromPlayer3;

          void CollectNumFromGusser(){
              Gusser g= new Gusser();
              numFromGusser= g.takeNumberGusser();
          }

          void CollectNumFromPlayer(){
              Player p1= new Player();
              numFromPlayer1= p1.takeNumberPlayer();

              Player p2= new Player();
              numFromPlayer2= p2.takeNumberPlayer();

              Player p3= new Player();
              numFromPlayer3= p3.takeNumberPlayer();
          }

          void compare(){
              if(numFromPlayer1 == numFromGusser)
              {
                  if(numFromPlayer2 == numFromGusser && numFromPlayer3 == numFromGusser){
                      System.out.println("All Players won the game");
                  }

                  else if(numFromPlayer2 == numFromGusser){
                      System.out.println("Plaver 1 and Player 2 won the game");
                  }

                  else if(numFromPlayer3 == numFromGusser){
                      System.out.println("Player 1 and Player 3 won the game");
                  }

                  else{
                      System.out.println("Only Player 1 won the game");
                  }
              }

              else if(numFromPlayer2 == numFromGusser) {
                  if (numFromPlayer3 == numFromGusser) {
                      System.out.println("Player 2 won the game");
                  } else {
                      System.out.println("Only Player 2 won the game");
                  }
              }
                  else if(numFromPlayer3 == numFromGusser){
                      System.out.println(" Only Player 3 won the game");
                  }
                  else {
                  System.out.println("No one won the game");
                  }


              }
          }


public class GusserGame
{
    public static void main(String[] args)
    {
        Umpire u=new Umpire();
        u.CollectNumFromGusser();
        u.CollectNumFromPlayer();
        u.compare();

    }
}
