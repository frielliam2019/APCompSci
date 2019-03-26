import java.util.Random;

public class Mage extends PlayerCharacter {


    int wis;

    public Mage (String newName){
        name = newName;
        System.out.println("A Mage named "+newName +" has been created!");
        Random rand = new Random();
        str = 7 + (rand.nextInt(6)+1);
        agl = 8 + (rand.nextInt(6)+1);
        intellij = 15 + (rand.nextInt(6)+1);
        wis = 10 + (rand.nextInt(6)+1);

        hp = hpMax = str;
        mp = mpMax= intellij + (2*wis);
    }

    public void showStats(){
        System.out.println("The Stats for player: "+name);
        System.out.println("Your mage has been created with:\nStrength - "+str+"\nAgility - "+agl+"\nIntelligence - "+intellij+"\nWisdom - "+wis+"\nHP - "+hp+"/"+hpMax+"\nMP - "+mp+"/"+mpMax+"\n\n");

    }

}


