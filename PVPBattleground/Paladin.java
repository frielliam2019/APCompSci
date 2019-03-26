import java.util.Random;

public class Paladin extends PlayerCharacter {


    int con;
    int wis;

    public Paladin (String newName){
        name = newName;
        System.out.println("A Paladin named "+newName +" has been created!");
        Random rand = new Random();
        str = 10 + (rand.nextInt(6)+1);
        agl = 5 + (rand.nextInt(6)+1);
        intellij = 15 + (rand.nextInt(6)+1);
        con = 10 + (rand.nextInt(6)+1);
        wis = 10 + (rand.nextInt(6)+1);

        hp = hpMax = str + 2*con;
        mp = mpMax= intellij + (2*wis);
    }

    public void showStats(){
        System.out.println("The Stats for player: "+name);
        System.out.println("Your Paladin has been created with:\nStrength - "+str+"\nAgility - "+agl+"\nIntelligence - "+intellij+"\nConstitution - "+con+"\nWisdom - "+wis+"\nHP - "+hp+"/"+hpMax+"\nMP - "+mp+"/"+mpMax+"\n\n");

    }

}
