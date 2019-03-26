import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static int w = 0;
    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();

        players.add(new Fighter("Liam"));
        players.add(new Mage("Bridgette"));
        players.add(new Paladin("Gabriel"));
        players.add(new Priest("John"));

        System.out.println(players.size());

        for (PlayerCharacter x : players){
            if (x instanceof Priest){
                System.out.println("Here is a Priest:");
                x.showStats();
            }
        }

    }
}
