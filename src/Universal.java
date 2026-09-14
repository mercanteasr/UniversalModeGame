import java.util.Scanner;

public class Universal {
    private String namePlayer = "";
    private int strengthPlayer = 0;
    private int defensePlayer = 0;

     static Players players = new Players();

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        boolean opcao = true;
        boolean description;
        do {
            System.out.println("Welcome to UUniversal Mode Game");
            System.out.println("Want to read our description?");

            /*description = sc.nextBoolean();
            if (description == true) {

                System.out.println("This mini-game was developed by Ricardo Augusto as a practical learning project.");
                System.out.println(" Its main purpose is to apply and consolidate fundamental Java programming concepts");
                System.out.println("serving as a simple hands-on exercise to continuously improve software development skills.");
            }*/

            System.out.println("\n _-_-_ Attributes _-_-_ \n");

            System.out.println("First Champion\n");
            players.assign(players.player1);
            System.out.println("Second Champion\n");
            players.assign(players.player2);

            players.battle();




                System.out.println("exit or continue? [true] or [false]");
                opcao = sc.nextBoolean();
            }while (opcao != false) ;

    }

    public void setDefensePlayer(int defensePlayer) {
        this.defensePlayer = defensePlayer;
    }
    public void setNamePlayer(String namePlayer){
        this.namePlayer = namePlayer;
    }
    public void setStrengthPlayer(int strengthPlayer){
        this.strengthPlayer = strengthPlayer;
    }
    public int getDefensePlayer(){
        return defensePlayer;
    }
    public int getStrengthPlayer(){
        return strengthPlayer;
    }
    public String getNamePlayer(){
        return namePlayer;
    }



}
