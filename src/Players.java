import java.util.Scanner;

public class Players {
    Scanner sc = new Scanner(System.in);

    Universal player1 = new Universal();
    Universal player2 = new Universal();

    // defining the extent of the damage
    int damageP1 = player1.getStrengthPlayer() / 2;
    int damageP2 = player2.getStrengthPlayer() / 2;

    // defining defense size
    double defenseP1 = player1.getDefensePlayer() / 1.3;
    double defenseP2 = player2.getDefensePlayer() / 1.3;


    public void assign(Universal player){
        // Request name of Champion
        System.out.println("Champion's name: ");
        String name = sc.next();
        player.setNamePlayer(name);
        // Request strength of Champion
        System.out.println(name+" Strength: ");
        int strength = sc.nextInt();
        player.setStrengthPlayer(strength);
        // Request Defense of Champion
        System.out.println(name+" Defense: ");
        int defense = sc.nextInt();
        player.setDefensePlayer(defense);

    }
    public void testechamar(){
        System.out.println("\nNAME FIRST CHAMPION..."+player1.getNamePlayer());
        System.out.println("\nSTRENGTH FIRST CHAMPION..."+player1.getStrengthPlayer());
        System.out.println("\nDEFENSE FIRST CHAMPION..."+player1.getDefensePlayer());
        System.out.println("__________________________________________");
        System.out.println("\nNAME SECOND CHAMPION..."+player2.getNamePlayer());
        System.out.println("\nSTRENGTH SECOND CHAMPION..."+player2.getStrengthPlayer());
        System.out.println("\nDEFENSE SECOND CHAMPION..."+player2.getDefensePlayer());
    }

    public void battle(){
        //calculo da batalha
        boolean died = false;

          player2.setDefensePlayer(Math.max(player2.getDefensePlayer() - player1.getStrengthPlayer(), 0));
          System.out.println(player1.getNamePlayer()+" dealt damage of "+ player1.getStrengthPlayer()+ " in "+ player2.getNamePlayer());
          System.out.println(player2.getNamePlayer()+" He suffered damage and was left with "+ player2.getDefensePlayer()+" of Defense");
          if(player2.getDefensePlayer() <= 0){
              died = true;
              System.out.println(player2.getNamePlayer()+" He died...");
          }

          if(died == false){
              player1.setDefensePlayer(Math.max(player1.getDefensePlayer() - player2.getStrengthPlayer(), 0));
              System.out.println(player2.getNamePlayer()+" dealt damage of "+ player2.getStrengthPlayer()+ " in "+ player1.getNamePlayer());
              System.out.println(player1.getNamePlayer()+" He suffered damage and was left with "+player1.getDefensePlayer()+ " of Defense");
              if(player1.getDefensePlayer() <= 0){
                  died = true;
                  System.out.println(player1.getNamePlayer()+ " He died...");
              }
          }

    }

}
