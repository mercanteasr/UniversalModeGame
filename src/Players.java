import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

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
        int strength = 0;
        do {
            strength = sc.nextInt();
            if (strength > 100) {
                System.out.println("Strength: "+strength+" | The force cannot be greater than 100");
            }
            player.setStrengthPlayer(strength);
        }while (strength > 100);
        // Request Defense of Champion
        System.out.println(name+" Defense: ");
        int defense = 0;
        do {
            defense = sc.nextInt();
            if (defense < strength) {
                System.out.println("Defense: " + defense + " | The defense cannot be layer than Strength");
            }
            player.setDefensePlayer(defense);
        }while (strength > defense);

    }
    public void testechamar(){
        System.out.print("\nNAME FIRST CHAMPION..."+player1.getNamePlayer());
        System.out.print("\nSTRENGTH FIRST CHAMPION..."+player1.getStrengthPlayer());
        System.out.print("\nDEFENSE FIRST CHAMPION..."+player1.getDefensePlayer());
        System.out.print("\n__________________________________________");
        System.out.print("\nNAME SECOND CHAMPION..."+player2.getNamePlayer());
        System.out.print("\nSTRENGTH SECOND CHAMPION..."+player2.getStrengthPlayer());
        System.out.print("\nDEFENSE SECOND CHAMPION..."+player2.getDefensePlayer());
        System.out.print("\n__________________________________________\n");

        boolean swordbygod = false;
        Random random = new Random();
        int randomswordplayer = random.nextInt(20);
        int randomplayer = random.nextInt(2);

        int test = 10;

        if(test == 10){
            swordbygod = true;
            if(randomplayer == 0){
                player1.setStrengthPlayer(player1.getStrengthPlayer() + 120);
            } else{
                player2.setStrengthPlayer(player2.getStrengthPlayer() + 120);
            }
        }
        if(swordbygod == true){
            System.out.println("\n\nSWORD OF GOD HAS BEEN INITIALIZED!!!");
        }
    }

    public void battle(){
        boolean died = false;
        // "Sword by God", is a best Damage in the game, total +120;


              player2.setDefensePlayer(Math.max(player2.getDefensePlayer() - player1.getStrengthPlayer(), 0));
              if(player1.getStrengthPlayer() > 101){
                  System.out.println(player1.getNamePlayer() +" USED THE SWORD OF GOD!!! and gave "+player1.getStrengthPlayer()+" damage in "+player2.getNamePlayer());
              }else {
                  System.out.println(player1.getNamePlayer() + " dealt damage of " + player1.getStrengthPlayer() + " in " + player2.getNamePlayer());
              }
              System.out.println(player2.getNamePlayer() + " He suffered damage and was left with " + player2.getDefensePlayer() + " of Defense");
              if (player2.getDefensePlayer() <= 0) {
                  died = true;
                  System.out.println(player2.getNamePlayer() + " He died...");
              }

              if (died == false) {
                  player1.setDefensePlayer(Math.max(player1.getDefensePlayer() - player2.getStrengthPlayer(), 0));
                  if(player2.getStrengthPlayer() > 101){
                      System.out.println(player2.getNamePlayer() +" USED THE SWORD OF GOD!!! and gave "+player2.getStrengthPlayer()+" damage in "+player1.getNamePlayer());
                  }else {
                      System.out.println(player2.getNamePlayer() + " dealt damage of " + player2.getStrengthPlayer() + " in " + player1.getNamePlayer());
                  }
                  System.out.println(player1.getNamePlayer() + " He suffered damage and was left with " + player1.getDefensePlayer() + " of Defense");
                  if (player1.getDefensePlayer() <= 0) {
                      died = true;
                      System.out.println(player1.getNamePlayer() + " He died...");
                  }
              }

        if(player1.getDefensePlayer() == 0) {
            JOptionPane.showMessageDialog(null, "The "+player2.getNamePlayer()+" Won "+player1.getNamePlayer());
        }else if(player2.getDefensePlayer() == 0){
            JOptionPane.showMessageDialog(null, "The "+player1.getNamePlayer()+" Won "+player2.getNamePlayer());
        }

    }

}
