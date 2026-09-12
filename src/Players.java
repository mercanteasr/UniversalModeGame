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
        System.out.println("\nNOME 1..."+player1.getNamePlayer());
        System.out.println("\nFORÇA 1..."+player1.getStrengthPlayer());
        System.out.println("\nDEFESA 1..."+player1.getDefensePlayer());
        System.out.println("__________________________________________");
        System.out.println("\nNOME 2..."+player2.getNamePlayer());
        System.out.println("\nFORÇA 2..."+player2.getStrengthPlayer());
        System.out.println("\nDEFESA 2..."+player2.getDefensePlayer());
    }

    public void battle(){

    }

}
